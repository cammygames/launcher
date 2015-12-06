/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject.dl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import net.rpproject.gui.window;
import org.bitlet.wetorrent.Metafile;
import org.bitlet.wetorrent.Torrent;
import org.bitlet.wetorrent.disk.PlainFileSystemTorrentDisk;
import org.bitlet.wetorrent.disk.TorrentDisk;
import org.bitlet.wetorrent.peer.IncomingPeerListener;

/**
 *
 * @author Michael Rosen
 */
public class download {
    private static final int PORT = 6881;

    public static void downloadMods() throws IOException, NoSuchAlgorithmException, Exception {
        String filename = null;

        Metafile metafile = new Metafile(new BufferedInputStream(new FileInputStream(filename)));

        TorrentDisk tdisk = new PlainFileSystemTorrentDisk(metafile, new File(window.getModText()));
        tdisk.init();

        IncomingPeerListener peerListener = new IncomingPeerListener(PORT);
        peerListener.start();

        Torrent torrent = new Torrent(metafile, tdisk, peerListener);
        torrent.startDownload();

        while (!torrent.isCompleted()) {

            try {
                Thread.sleep(1000);
            } catch(InterruptedException ie) {
                break;
            }

            torrent.tick();
        }

        torrent.interrupt();
        peerListener.interrupt();
    }
}