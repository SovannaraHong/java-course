/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name  :");
        String userName = scanner.nextLine();
        System.out.println("Hello" + userName);
        System.out.print("Enter Your Age...: ");
        int ages = scanner.nextInt();

        if (ages > 18) {
            System.out.print("Enter Your blood level:");
            int blood = scanner.nextInt();
            if (blood > 3) {
                System.out.println("enter your kilo");
                double kilo = scanner.nextInt();
                System.out.print("Your blood is " + blood);
                System.out.print("Your kilo is " + kilo);

            } else {
                System.out.println("You can not be donate blood");

            }

        } else {
            System.out.println("Your age is " + ages +"years old");
            System.out.println("YOu can not be desploy blood!");
        }

        scanner.close();

        // String 
        String names = "Hong sovannara";
        String text = "I love you ";
        //Int
        int age = 20;
        //double
        double money = 200.2;
        //char
        char dolla = '$';
        char tean = '!';
//bolean

        boolean isStudent = true;
        boolean isActive = true;

        // TODO code application logic here
        System.out.println("Welcome to Java First Section ");
        System.out.println("It me :" + names);
        System.out.println("I am " + age + "year olds" + tean);
        System.out.println("My bank account: " + money + dolla);

        if (age >= 20) {
            System.out.println("You are adult");
        } else if (age <= 15) {
            System.out.println("YOu are Young");
        } else {
            System.out.println("You are a man");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(text);
        }
        if (!isStudent) {
            System.out.println("You are not student");
        } else if (isStudent && isActive) {
            System.out.println("You are  a good Student" + tean);

        } else if (isActive) {
            System.out.println("You are Active Student in the class");
        } else {
            System.out.println("You are a student " + tean + "Your name is" + names);
        }
        System.out.println("");

    }

}
