/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Splash;

import com.sun.awt.AWTUtilities;
import javax.swing.JFrame;

/**
 *
 * @author werner_pc
 */
public class Transparencia {
    public void TransCompFrame(JFrame frm){
        frm.setUndecorated(true);
        AWTUtilities.setWindowOpaque(frm, false);
        
    }
}
