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
public class NewClass implements Table{
    public static void main(String[] args) {
        //Error ejemplo = new Error(media,desviacion,tamanio,nc);
        error.SetError(3100.0,150.0,100.0,95.0);
        //System.out.println(error.zeta(Double.NaN));
        System.out.println("El intervalo va desde: "+error.IConfianzaInferior()+" Hasta "+error.IConfianzaSuperior());
        
        
        System.out.println("Problema de probabilidad");
        System.out.println("donde:\nDesviacion = 50\nMedia = 150\nProbabilidad = 190 \nEl resultado deberia ser = 0.7881");
        System.out.println("El resultado es: "+probabilidad.resultado(probabilidad.probabilidad(150.0, 50.0, 190.0)));
    }
}
