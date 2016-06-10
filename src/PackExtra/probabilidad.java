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
public class probabilidad {
    
    
    public static boolean esEntero(double numero){
        if (numero%0.1==0)
            return true;
        else return false;
    }
    
    //DISTRIBUCION NORMAL DE PROBABILIDAD
    public static double probabilidad(double media, double desviacion, double prob){    
        return ((prob - media)/desviacion);
    }
    
    public static Double resultado(Double probabilidad){
        Double x = 0.0, y = 0.0, copia =0.0;
        x = probabilidad * 10;
        y = (x%1)*10;
        return Error.getPosition(x.intValue(),y.intValue());
    }
    
    public static double porcentaje(double p){
        return p * 100;
    }
}