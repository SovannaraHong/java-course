/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exericse;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class SwichCaseCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first Number: ");
        double first_Number = input.nextDouble();
        System.out.print("Enter second Number: ");
        double second_Number = input.nextDouble();
        
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choise =input.nextInt();
        
        switch (choise){
            case 1:
            System.out.println("Result" + (first_Number + second_Number));
            break;
             case 2:
            System.out.println("Result" + (first_Number - second_Number));
            break; 
             case 3:
            System.out.println("Result" + (first_Number * second_Number));
            break; 
             case 4:
            System.out.println("Result" + (first_Number / second_Number));
            break;
             default:
                 System.out.println("Invalid Choice ");
        }
        
           
        
    }
    
}
