/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Splash.SplashCreem;

/**
 *
 * @author werner
 */
public class Principal {
      public static void main(String[] args) {
        // TODO code application logic here
        new Thread(new SplashCreem()).start();
    }
}
