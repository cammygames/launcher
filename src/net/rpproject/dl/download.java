/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject.dl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.rpproject.gui.window;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Michael Rosen
 */
public class download {
  
    public static double filesize;
    public static String filename;
    
    private static class ProgressMonitor implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double d  = ((DownloadWatcher) e.getSource()).getByteCount();
            double dpercent = (d / filesize) * 100;
            int percent = (int) dpercent;
            window.setProgressText("Downloading " + filename + " : " + percent + "%");
            window.setProgress(percent);
            if(percent == 100) {
                window.setProgressText("Download Complete");
                window.setProgress(0);
            }
        }
    }    
    
    public static void downloadFile(String fileurl) {
        Runnable runner;
        runner = () -> {
            try {
                fileDownloader(fileurl);
            }  catch (IOException ex) {
                Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Thread t = new Thread(runner, "RRP Download Thread");
        t.start();        
    }
    
    /**
    * This method is for downloading a file from a URL. 
    * @param fileurl The URL that the download needs to occur
    * @throws IOException 
    */
    public static void fileDownloader(String fileurl) throws IOException {

        URL url = null;
        OutputStream fos = null;
        InputStream fis = null;
        File file;    
        ProgressMonitor monitor = new ProgressMonitor();
      
        try {
            if (!window.getModText().equals("")) {
                url = new URL(fileurl);

                String fileName = FilenameUtils.getBaseName(fileurl);
                String extension = FilenameUtils.getExtension(fileurl);
                
                file = new File(window.getModText());                
                fos = new FileOutputStream(file + "\\" + fileName + "." + extension);
                fis = url.openStream();
        
                DownloadWatcher watcher = new DownloadWatcher(fos);
                watcher.setListener(monitor);

                filesize = Double.parseDouble(url.openConnection().getHeaderField("Content-Length"));
                filename = fileName;  
                
                IOUtils.copy(fis,watcher);            
            }
        } catch (IOException | NumberFormatException e) {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            Logger.getLogger("RPP").log(Level.INFO, "{0} Error Downloading file: {1}", new Object[]{timeStamp, fileurl});
            Logger.getLogger("RPP").log(Level.INFO, (Supplier<String>) e);             
        } finally {
            if (fos != null) { 
                fos.close(); 
            }
            if (fis != null) { 
                fis.close(); 
            }
        }
    }
}