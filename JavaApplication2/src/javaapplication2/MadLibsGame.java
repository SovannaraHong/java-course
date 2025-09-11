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
import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verb1;
        String verb2;
        String noun;
        String abjective1;
        String abjective2;

        System.out.print("enter verb1 :");
        verb1 = scanner.nextLine();
        System.out.print("enter verb1:");
        verb1 = scanner.nextLine();
        System.out.print("enter noun:");
        noun = scanner.nextLine();
        System.out.print("enter noun:");
        noun = scanner.nextLine();
        System.out.print("enter verb2");
        verb2 = scanner.nextLine();
        System.out.print("enter abjective1");
        abjective1 = scanner.nextLine();
        System.out.print("enter abjective2");
        abjective2 = scanner.nextLine();

        System.out.println("Hello" + verb1 + "I'm A student at");
        System.out.println(verb1 + "Institute or university");
        System.out.println("I study Marjor is" + noun);
        System.out.println("My subject i like and i love and i want to learn it " + noun);
        System.out.println("I really love" + verb2);
        System.out.println("In the freetime i want to play " + abjective1);
        System.out.println("I dont drink " + abjective2);
        scanner.close();

    }

}
