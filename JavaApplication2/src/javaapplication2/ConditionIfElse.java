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

public class ConditionIfElse {  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;
        String CheckStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        input.nextLine();
        System.out.print("Are you a student or not (true/false) :");
        isStudent = input.nextBoolean();
       

        //GROUP 1   
        if (name.isEmpty()) {
            System.out.println("Pleae enter your name you missing input name");
        } else {
            System.out.println("hello " + name);
        }

        // GROUP 2
        if (age > 65) {
            System.out.println("You are a Senuire");
        } else if (age >= 18) {
            System.out.println("You are adult");

        } else if (age < 0) {
            System.out.println("You are have'nt been born yet");
        } else if (age == 0) {
            System.out.println("You are a babe");
        } else if (age < 18 && age > 0) {
            System.out.println("You are a young");
        }

        // GROUP 3  
        if (isStudent) {
            System.out.println("You are a Student");
        } else {
            System.out.println("You are not a student");
        }

        System.out.println("Your age is : " + age + "year old");
        input.close();
    }

}
