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

public class MadLibsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String abjective1;
        String abjective2;
        String verb1;
        String verb2;
        String noun;
        String abjective3;

        System.out.print("Enter Abjective1 :");
        abjective1 = scanner.nextLine();
        System.out.print("Enter abjective2 :");
        abjective2 = scanner.nextLine();
        System.out.print("Enter noun :");
        noun = scanner.nextLine();
        System.out.print("Enter verb1 :");
        verb1 = scanner.nextLine();
        System.out.print("Enter Verb1 :");
        verb2 = scanner.nextLine();
        System.out.print("Enter abjective3 :");
        abjective3 = scanner.nextLine();

        System.out.println("it Was a " + abjective1 + " cold November Daty");
        System.out.println("I woke up to the " + abjective2 + "smell of ");
        System.out.println("roastring in the " + noun);
        System.out.println(" downstairs. i" + verb1 + "down the stairs to see if i could help ");
        System.out.println(verb1 + "the dinner My mom said ");
        System.out.println(abjective3 + "the dinner My mom said ");
        
        scanner.close();
        

    }

}
