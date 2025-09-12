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

public class SystemProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Pizza1 = 0;
        int food = 0;
        int coca = 4000;
        int sting = 3400;
        int beer = 5000;
        int area = 0;
        int ham1 = 0;
        int drink=0;

        System.out.print("What do you want to eat:");
        String Order = scanner.nextLine();
        if (Order.toLowerCase().equals("pizza")) {
            System.out.println("What Price Do you want to buy that have " + Pizza1);
            food = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Get Drink Or not :");
            Order = scanner.nextLine();
            if (Order.toLowerCase().equals("yes")) {
                System.out.println("What do you want to order Drink");
                System.out.print("That have coca, sting,beer");
                drink= scanner.nextInt();

            }
            area = food + drink;
            System.out.println(area);

        } else if (Order.toLowerCase().equals("hambugar")) {
            System.out.print("What Price do you want to buy" + ham1);
            Order = scanner.nextLine();

        }

        scanner.close();

    }

}
