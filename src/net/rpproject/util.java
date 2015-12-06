/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.io.FileInputStream;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author Michael Rosen
 */
public class util {

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (URISyntaxException | IOException e) {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            Logger.getLogger("RPP").log(Level.INFO, timeStamp + "Error loading webpage"); 
        }
    }
    
    public static void showErrMsg(JFrame frame, String msg) {
        JOptionPane.showMessageDialog(frame, msg);
    }

    /**
    * Read the file and calculate the SHA-1 checksum
    * 
    * @param file
    *            the file to read
    * @return the hex representation of the SHA-1 using uppercase chars
    * @throws FileNotFoundException
    *             if the file does not exist, is a directory rather than a
    *             regular file, or for some other reason cannot be opened for
    *             reading
    * @throws IOException
    *             if an I/O error occurs
    * @throws NoSuchAlgorithmException
    *             should never happen
    */
    public static String calcSHA1(File file) throws FileNotFoundException, IOException, NoSuchAlgorithmException {

       MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
       try (InputStream input = new FileInputStream(file)) {

           byte[] buffer = new byte[8192];
           int len = input.read(buffer);

           while (len != -1) {
               sha1.update(buffer, 0, len);
               len = input.read(buffer);
           }

           return new HexBinaryAdapter().marshal(sha1.digest());
       }
    }

    
    /**
    * Writes a JSON object to a .json file
    * .json file extension is not to be passed
    * @parma JSONObject
    * @parma path
    * @parma filename
    * @throws IOException
    */
    public static void writeJson(JSONObject obj, String path, String fileName) throws IOException {
        try (FileWriter file = new FileWriter(path + fileName + ".json");){    
            file.write(obj.toJSONString());
        }
    }
}
