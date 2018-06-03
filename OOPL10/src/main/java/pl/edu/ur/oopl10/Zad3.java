/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.util.Scanner;

/**
 *
 * @author MICHAL
 */
public class Zad3 extends Exception {
    public static void zad3(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj dzielna: ");
            int x = scanner.nextInt();
            System.out.println("Podaj dzielnik: ");
            int y = scanner.nextInt();        
    try {
            int dzielenie = x / y;
            System.out.println("Wynik: " + dzielenie);
        } catch (ArithmeticException e) {
            System.err.println("Nie można dzielić przez zero!");
        }    
    }
}