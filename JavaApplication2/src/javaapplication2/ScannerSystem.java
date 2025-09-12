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

        String order;
        System.out.println("Welcome to akira restaurant...");
        System.out.println("What do you want to eat?");
        System.out.print("Answer :");
        order = input.nextLine();
        if (order.toLowerCase().equals("food")) {
            System.out.println("We have Pizaa and Hambugar");
            System.out.print("What do you want: ");
            order = input.nextLine();
            if (order.equalsIgnoreCase("hambugar")) {
                System.out.println("Which hambugar size do you want? ");
                System.out.println("That have");
                System.out.println("HambugarSmall" + hamSmall);
                System.out.println("HambugarMedium" + hamMedium);
                System.out.println("HambugarLarge" + hamLarge);
                System.out.println("Choise have (1/2/3):");
                int choise=input.nextInt();
                input.nextLine();
                
                if(choise==1){
                    System.out.println("You chose smallSize" +hamSmall);
                    
                }else if(choise==2){
                    System.out.println("You chose MediumSize" +hamMedium);
                }else if(choise==3){
                    System.out.println("You chose LargeSize"+ hamLarge);
                }else{
                    System.out.println("invalid Size");
                }
            }

        }

        input.close();

    }

}
