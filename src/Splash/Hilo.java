/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Splash;

import javax.swing.JProgressBar;

/**
 *
 * @author werner_pc
 */
public class Hilo extends Thread {
    private int num = 0;
    private  JProgressBar Barra;
   
    public Hilo(JProgressBar Barra){
        this.Barra = Barra;
    }

    
    
    private void llenarBarra(){
        if(Barra.getValue() <=100){
            num += 3;
            Barra.setValue(num);
            Barra.setStringPainted(true);
            
        }else{
            Barra.setValue(0);
        }
    }
    
    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(170);
                llenarBarra();
            }catch(InterruptedException ex){
                
            }
        }
    }
}
