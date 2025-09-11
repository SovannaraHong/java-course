/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class ScannerSystem {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name...");
        String name =scanner.nextLine();
        System.out.println("Hello"+name);
        scanner.close();
    }
    
}
