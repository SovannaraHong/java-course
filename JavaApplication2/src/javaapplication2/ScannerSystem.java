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
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        double hight = 0;
        double weith = 0;
        double area =0;
        
        System.out.println("Enter Your Hight:");
        hight=scanner.nextDouble();
        System.out.println("Enter Your Weight:");
        weith =scanner.nextDouble();
        
         area= hight * weith;
         System.out.println("The Area is " + area);
        
        scanner.close();
        
        
    }
    
}
