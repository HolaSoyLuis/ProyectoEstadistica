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
        Error error = new Error(25.0,5.0,40.0,95.0);
        System.out.println(error.zeta(Double.NaN));
    }
}
