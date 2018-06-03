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
public class Zad2 {
    public static void main(String[] args){
        int[] tablica = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Który element tablicy wyświetlić?");
        int index = scanner.nextInt();
        try {
            System.out.println(tablica[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy!");
        }        
    }
}
