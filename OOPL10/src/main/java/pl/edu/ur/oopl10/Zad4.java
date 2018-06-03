/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.util.Random;

/**
 *
 * @author MICHAL
 */
public class Zad4 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(11)-10;
        int y = r.nextInt(11)-10;
        try {
            System.out.println("X: "+x);
            System.out.println("Y: "+y);
            double dzielenie = x / y;
            System.out.println(dzielenie);
        } catch (ArithmeticException e) {
            System.err.println("Nie można dzielic przez zero!");
        }
    }    
}
