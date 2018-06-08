/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highnumber_finder;

import java.util.Scanner;


public class HighNumber_finder {

    
    public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter first number :");
        int num1 = scn.nextInt();
        
        System.out.println("Enter second number : ");
        int num2 = scn.nextInt();
        
        System.out.println("Enter third number :");
        int num3 =scn.nextInt();
        
        if (num1>num2)
        if (num1 > num3)
                System.out.println("The Highest number is :" + num1);
        
        if (num2 > num1)
        if (num2 > num3)
                System.out.println("The Highest number is :" + num2);
        
        if (num3>num1)
        if (num3 > num2)
                System.out.println("The Highest number is :" + num3);
        
        if (num1 == num2)
        if (num1 == num3)
        if (num2 == num1)
        if (num2 == num3)
        if (num3 == num1)
        if (num3 == num2)
                                System.out.println("All numbers are equal");  
    }
    
}
