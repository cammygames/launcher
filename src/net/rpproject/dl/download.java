/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject.dl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import net.rpproject.gui.window;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Michael Rosen
 */
public class download {
  
    /**
    * This method is for downloading a file from a URL. 
    * @param fileurl The URL that the download needs to occur
    * @throws IOException 
    */
    public static void downloadFile(String fileurl) throws IOException {

        URL url = null;
        OutputStream fos = null;
        InputStream fis = null;
     
        File file;        
        double filesize;

        try {
            if (!window.getModText().equals("")) {
                url = new URL(fileurl);

                String fileName = FilenameUtils.getBaseName(fileurl);
                String extension = FilenameUtils.getExtension(fileurl);
                
                file = new File(window.getModText());                
                fos = new FileOutputStream(file + "\\" + fileName + "." + extension);
                fis = url.openStream();

                IOUtils.copy(fis,fos);            
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
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
