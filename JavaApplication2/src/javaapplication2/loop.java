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
public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  int i=1;
  while (i<5){
      System.out.println("number is"+i)   ;
      i++;
  }
       
        int num ;
        System.out.print("enter num");
        num=input.nextInt();
        while (true){
            if(num >12){
                 System.out.print("try again:");
                 num=input.nextInt();
                 
            }
            else{
                System.out.print("result"+num);
                break;
            }
            
           
            
        }
        
    }
}

        
