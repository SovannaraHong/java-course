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

public class ShoppingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char dolla = '$';
        double total;

        System.out.print("What Item would you like to buy: ");
        item = input.nextLine();

        System.out.print("What Price you would  like to buy: ");
        price = input.nextDouble();

        System.out.print("What quantity you would like : ");
        quantity = input.nextInt();

        total = price * quantity;

        if (quantity > 1) {
            System.out.println("The item you buy that have" + " " + item + "/s" + " " + quantity);
        } else {
            System.out.println("The item you buy that have" + " " + item + " " + quantity);
        }
        System.out.printf("Your total is: %.2f%c%n", total, dolla);

    }

}
