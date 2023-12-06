/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.landtractdemo;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */
public class LandTractDemo 
{

    public static void main(String[] args) 
    {
        // variables
        double farmLength;  // length of the farm (tract 1)
        double farmWidth;   // width of the farm (tract 1)
        double backyardLength;  // length of the backyard (tract 2)
        double backyardWidth;   // width of the backyard (tract 2)
        
        // create scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // ask user to enter the dimensions (length and width) for the farm (tract 1)
        System.out.println("Enter the length of the farm, in feet. ");
        farmLength = keyboard.nextDouble();
        
        System.out.println("Enter the width of the farm, in feet. ");
        farmWidth = keyboard.nextDouble();
        
        // create Land Tract object (farm) using the length and width provided by the user
        LandTract farm = new LandTract(farmLength, farmWidth);
        
        // ask user to enter the dimensions (length and width) for the backyard (tract 2)
        System.out.println("\nEnter the length of the backyard, in feet. ");
        backyardLength = keyboard.nextDouble();
        
        System.out.println("Enter the width of the backyard, in feet. ");
        backyardWidth = keyboard.nextDouble();
        
        // create a second Land Tract object (backyard) using the length and width provided by the user
        LandTract backyard = new LandTract(backyardLength, backyardWidth);
        
        // display the area of the farm and the backyard, rounded to 2 decimal places
        System.out.printf("\nThe area of the farm is %,.2f square feet, Orlando Marin.\n", farm.area());
        System.out.printf("The area of the backyard is %,.2f square feet, Orlando Marin.\n", backyard.area());
        
        /* indicate whether the farm and backyard are the same size. They are 
        equal only if their corresponding fieelds have the same values */
        if (farm.equals(backyard))
        {
            System.out.println("Since the farm and backyard have the same length and width, they are the same size!");
        }
        else 
        {
            System.out.println("Since the farm and backyard do not have the same length and width, they are not the same size.");
        }
        
        /* call toString implicitly to show the length, width, and area of 
        the farm and the backyard */
        System.out.println("\nFarm");
        System.out.println(farm);
        
        System.out.println("\nBackyard");
        System.out.println(backyard);
    }
}
