/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import net.rpproject.util;
import java.io.File;
import net.rpproject.launcher;

/**
 *
 * @author Michael Rosen
 */
public class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sponsor1 = new javax.swing.JLabel();
        downloadProgress = new javax.swing.JProgressBar();
        websiteJPan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        websitePane = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modDir = new javax.swing.JTextField();
        installDir = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        changeLog = new javax.swing.JTextArea();
        launchGame = new javax.swing.JButton();
        updateCheck = new javax.swing.JButton();
        downloadMods = new javax.swing.JButton();
        selectedDir = new javax.swing.JButton();
        selectedModDir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPProject Launcher V0.0.1");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sponsored By", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        sponsor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/rpproject/res/servacityLogo.png"))); // NOI18N
        sponsor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sponsor1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sponsor1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sponsor1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        downloadProgress.setMinimum(0);
        downloadProgress.setMaximum(100);
        downloadProgress.setStringPainted(true);

        websiteJPan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        websitePane.setEditable(false);
        try {
            websitePane.setPage("https://cyberworks.org.uk/");
        } catch (Exception ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(websitePane);

        javax.swing.GroupLayout websiteJPanLayout = new javax.swing.GroupLayout(websiteJPan);
        websiteJPan.setLayout(websiteJPanLayout);
        websiteJPanLayout.setHorizontalGroup(
            websiteJPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(websiteJPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        websiteJPanLayout.setVerticalGroup(
            websiteJPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(websiteJPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Arma 3 Mod Directory");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Arma 3 Install Directory");

        modDir.setEditable(false);

        installDir.setEditable(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/rpproject/res/darkLogo.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        changeLog.setEditable(false);
        changeLog.setColumns(20);
        changeLog.setRows(5);
        jScrollPane1.setViewportView(changeLog);

        launchGame.setText("Launch Arma 3");
        launchGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchGameActionPerformed(evt);
            }
        });

        updateCheck.setText("Check For Updates");
        updateCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCheckActionPerformed(evt);
            }
        });

        downloadMods.setText("Download Mods");
        downloadMods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadModsActionPerformed(evt);
            }
        });

        selectedDir.setText("...");
        selectedDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedDirActionPerformed(evt);
            }
        });

        selectedModDir.setText("...");
        selectedModDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedModDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(websiteJPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(launchGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downloadMods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(downloadProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(installDir, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(modDir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedDir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedModDir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(websiteJPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(launchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downloadMods, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectedDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(installDir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectedModDir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modDir, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(downloadProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        util.openWebpage("https://forum.rpproject.net/");
    }//GEN-LAST:event_logoMouseClicked

    private void updateCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCheckActionPerformed
        if (!window.getModText().equals("")) {
            File modJson = new File(launcher.dataFolder + "\\RPP\\mod.xml");
            File modJsonBack = new File(launcher.dataFolder + "\\RPP\\mod.xml.old");            
            if (modJson.exists()) {
                modJson.renameTo(modJsonBack);
            } 
       
        } else {
            util.showErrMsg(this, "Please select a mod installation directory");
        }        
    }//GEN-LAST:event_updateCheckActionPerformed

    private void launchGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchGameActionPerformed
        try {
            File arma3exe = new File(installDir.getText() + "\\arma3.exe");
            File battleyeexe = new File(installDir.getText() + "\\arma3battleye.exe");
            
            if (!installDir.getText().equals("")) {
                if (arma3exe.exists() && battleyeexe.exists()) {
                    Process arma3 = new ProcessBuilder(installDir.getText() + "\\arma3.exe").start();
                    Process batteleye = new ProcessBuilder(installDir.getText() + "\\arma3battleye.exe").start();
                } else {
                    util.showErrMsg(this, "Could not find Arma 3 or Battleye");
                }
            } else {
                util.showErrMsg(this, "No Installation Directory. Please select your installation directory!");
            }
        } catch (Exception ex) {
            Logger.getLogger("RPP").log(Level.INFO, "Error Launching Arma 3", ex);           
        }
    }//GEN-LAST:event_launchGameActionPerformed

    private void downloadModsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadModsActionPerformed
        if (!window.getModText().equals("")) {
            
        } else {
            util.showErrMsg(this, "Please select a mod installation directory");
        }
    }//GEN-LAST:event_downloadModsActionPerformed

    private void selectedDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedDirActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        File defaultArma3 = new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Arma 3\\arma3.exe");
        if (defaultArma3.exists()) {
            chooser.setCurrentDirectory(defaultArma3);
        } else {
            Logger.getLogger("RPP").log(Level.INFO, "Arma 3 not in default path");
            chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "\\Documents"));
        }
        chooser.setDialogTitle("Select Arma 3 Directory");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File arma3 = new File(chooser.getSelectedFile().getAbsolutePath() + "\\arma3.exe");
            if (arma3.exists()) {    
                Logger.getLogger("RPP").log(Level.INFO, "Arma 3 found");
                File battleEye = new File(chooser.getSelectedFile().getAbsolutePath() + "\\arma3battleye.exe");
                if (battleEye.exists()) {
                    installDir.setText(chooser.getSelectedFile().getAbsolutePath());
                    if (window.getModText().equals("")) {
                        modDir.setText(chooser.getSelectedFile().getAbsolutePath());
                    }
                } else {
                    util.showErrMsg(this, "Battle Eye not found");                
                }
            } else {
                util.showErrMsg(this, "Arma 3 not found");                   
            }
        } else {
            util.showErrMsg(this, "Please select your Arma 3 Directory");
        }
    }//GEN-LAST:event_selectedDirActionPerformed

    private void selectedModDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedModDirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select Arma 3 Mod Install Directory");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            modDir.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
            util.showErrMsg(this, "No Selection");
        }
    }//GEN-LAST:event_selectedModDirActionPerformed

    private void sponsor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sponsor1MouseClicked
        util.openWebpage("http://www.servacity.com/");
    }//GEN-LAST:event_sponsor1MouseClicked
    
    public static String getModText() {
        return modDir.getText();
    }
    
    public static void setProgress(final int value) {
        downloadProgress.setValue(value);
    }
    
    public static void setProgressText(String msg) {
        downloadProgress.setString(msg);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea changeLog;
    private javax.swing.JButton downloadMods;
    private static javax.swing.JProgressBar downloadProgress;
    private javax.swing.JTextField installDir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton launchGame;
    private javax.swing.JLabel logo;
    private static javax.swing.JTextField modDir;
    private javax.swing.JButton selectedDir;
    private javax.swing.JButton selectedModDir;
    private javax.swing.JLabel sponsor1;
    private javax.swing.JButton updateCheck;
    private javax.swing.JPanel websiteJPan;
    private javax.swing.JEditorPane websitePane;
    // End of variables declaration//GEN-END:variables
}
