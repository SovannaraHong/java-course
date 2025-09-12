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
        Scanner input = new Scanner(System.in);
        int coca = 3000;
        int sting = 3500;
        int alcohol = 5500;

        int pizzaSmall = 8000;
        int pizzaMedium = 10000;
        int pizzaLarge = 12000;

        int hamSmall = 7000;
        int hamMedium = 9000;
        int hamLarge = 11000;

        double total = 0;
        int choise = 0;
        int totalChoise = 0;

        String order;
        System.out.println("Welcome to akira restaurant...");
        System.out.println("you want to eat or drink?");
        System.out.print("Answer :");
        order = input.nextLine();
        if (order.equalsIgnoreCase("eat")) {
            System.out.print("what do you want to eat:");
            order = input.nextLine();
            if (order.toLowerCase().equals("food")) {
                System.out.println("We have Pizaa and Hambugar");
                System.out.print("What do you want: ");
                order = input.nextLine();
                if (order.equalsIgnoreCase("hambugar") || order.equalsIgnoreCase("ham")) {
                    System.out.println("Which hambugar size do you want? ");
                    System.out.println("That have");
                    System.out.println("HambugarSmall" + hamSmall);
                    System.out.println("HambugarMedium" + hamMedium);
                    System.out.println("HambugarLarge" + hamLarge);
                    System.out.println("Choise have (1/2/3):");
                    choise = input.nextInt();
                    input.nextLine();

                    if (choise == 1) {
                        System.out.println("You chose smallSize" + hamSmall);
                        total += hamSmall;
                        totalChoise += hamSmall;

                    } else if (choise == 2) {
                        System.out.println("You chose MediumSize" + hamMedium);
                        total += hamMedium;
                        totalChoise += hamMedium;
                    } else if (choise == 3) {
                        System.out.println("You chose LargeSize" + hamLarge);
                        total += hamLarge;
                        totalChoise += hamLarge;
                    } else {
                        System.out.println("invalid Size");
                    }
                } else if (order.equalsIgnoreCase("pizza")) {
                    System.out.println("Which Size do you want? ");
                    System.out.println("That hav size");
                    System.out.println("smallPizza" + pizzaSmall);
                    System.out.println("Meduim Pizza" + pizzaMedium);
                    System.out.println("Large Pizza" + pizzaLarge);
                    System.out.println("Which size you want (1/2/3) :");
                    choise = input.nextInt();
                    input.nextLine();
                    if (choise == 1) {
                        System.out.println("your size pizza is " + pizzaSmall);
                        total += pizzaSmall;
                        totalChoise += pizzaSmall;
                    } else if (choise == 2) {
                        System.out.println("Your size pizza is" + pizzaMedium);
                        total += pizzaMedium;
                        totalChoise += pizzaMedium;
                    } else if (choise == 3) {
                        System.out.println("Your size pizza is " + pizzaLarge);
                        total += pizzaLarge;
                        totalChoise += pizzaLarge;
                    } else {
                        System.out.println("Invalid size");
                    }

                } else if (order.equalsIgnoreCase("both")) {
                    System.out.println("Which hambugar size do you want? ");
                    System.out.println("That have");
                    System.out.println("HambugarSmall" + hamSmall);
                    System.out.println("HambugarMedium" + hamMedium);
                    System.out.println("HambugarLarge" + hamLarge);
                    System.out.println("Choise have (1/2/3):");
                    choise = input.nextInt();
                    input.nextLine();

                    if (choise == 1) {
                        System.out.println("You chose smallSize" + hamSmall);
                        total += hamSmall;
                        totalChoise += hamSmall;

                    } else if (choise == 2) {
                        System.out.println("You chose MediumSize" + hamMedium);
                        total += hamMedium;
                        totalChoise += hamMedium;
                    } else if (choise == 3) {
                        System.out.println("You chose LargeSize" + hamLarge);
                        total += hamLarge;
                        totalChoise += hamLarge;
                    } else {
                        System.out.println("invalid Size");
                    }

                    System.out.println("Which Size do you want? ");
                    System.out.println("That hav size");
                    System.out.println("smallPizza" + pizzaSmall);
                    System.out.println("Meduim Pizza" + pizzaMedium);
                    System.out.println("Large Pizza" + pizzaLarge);
                    System.out.println("Which size you want (1/2/3) :");

                    input.nextLine();
                    if (choise == 1) {
                        System.out.println("your size pizza is " + pizzaSmall);
                        total += pizzaSmall;
                        totalChoise += pizzaSmall;
                    } else if (choise == 2) {
                        System.out.println("Your size pizza is" + pizzaMedium);
                        total += pizzaMedium;
                        totalChoise += pizzaMedium;
                    } else if (choise == 3) {
                        System.out.println("Your size pizza is " + pizzaLarge);
                        total += pizzaLarge;
                        totalChoise += pizzaLarge;
                    } else {
                        System.out.println("Invalid size");
                    }

                }

            }
            System.out.println("You Need Drink or not");
            order = input.nextLine();
           
            if (order.toLowerCase().matches("need|yes|ok|okay")) {
                System.out.println("Which Drink you order:");
                System.out.println("That have 3 choices: Coca, Sting, Alcohol");
                System.out.println("Coca Price = " + coca);
                System.out.println("Sting Price = " + sting);
                System.out.println("Alcohol Price = " + alcohol);
                System.out.print("Which one you choose (1/2/3): ");
                choise=input.nextInt();
                if(choise==1){
                    System.out.println("Your choise is coca:" + coca);
                    total+=coca;
                    totalChoise+=coca;
                }else if(choise==2){
                    System.out.println("Your choise is sting:" +sting);
                    total+=coca;
                    totalChoise+=sting;
                }else if(choise ==3){
                    System.out.println("Your choise is alcohol :" +alcohol);
                      total+=alcohol;
                    totalChoise+=alcohol;
                }else {
                    System.out.println("invalid choise");
                }
           
            }
        } else if (order.equalsIgnoreCase("drink")) {

        }

        System.out.println("Your chosie " + totalChoise);
        System.out.println("Your total price is" + total + "Riel");

        input.close();

    }

}
