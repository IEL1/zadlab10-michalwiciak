/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author MICHAL
 */
public class Test extends Zad3 {
    public void test() {
        try {
            zad3();
        } catch (ArithmeticException e) {
            System.out.println("Błąd wyłapany " + e);
        }   
   } 
}
