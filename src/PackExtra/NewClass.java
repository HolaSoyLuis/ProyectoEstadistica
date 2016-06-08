/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackExtra;

/**
 *
 * @author Lu!s
 */
public class NewClass {
    public static void main(String[] args) {
        //Error error = new Error(media,desviacion,tamanio,nc);
        Error error = new Error(3100.0,150.0,100.0,95.0);
        //System.out.println(error.zeta(Double.NaN));
        System.out.println("El intervalo va desde: "+error.IConfianzaInferior()+" Hasta "+error.IConfianzaSuperior());
    }
}
