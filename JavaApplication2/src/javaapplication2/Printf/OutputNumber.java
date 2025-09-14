/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Printf;

/**
 *
 * @author ADMIN
 * Note Print if negative number use %(.2f\n have ( it convert to (3049)
 */
public class OutputNumber {

    public static void main(String[] args) {
        double price1 = 1000.33;
        double price2 = 30454.44;
        double price3 = 10002.99;
        double price4 =-489.53;

        System.out.printf("Result1 %.2f\n", price1);
        System.out.printf("Result2 %.2f\n", price2);
        System.out.printf("Result3 %.2f\n", price3);
        System.out.printf("Result4 %(.2f\n",price4);

    }

}
