/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.landtractdemo;

/**
 *
 * @author orlandomarin
 */
public class LandTract 
{
    // 2 instance fields, one for the tract's length and one for the width 
    private double length;
    private double width;
    
    // constructor that creates a land tract based on the leength and width
    public LandTract (double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    // constructor that copies the instance field values
    public LandTract (LandTract object2)
    {
        length = object2.length;
        width = object2.width;
    }
    
    // method that returns the tract's area
    public double area()
    {
        return length * width;
    }
    
    /* equals method where two LandTract objects are equal only if 
    their corresponding fields have the same values */
    public boolean equals(LandTract object2)
    {
        boolean status = false;
        
        if (length == object2.length && width == object2.width)
        {
            status = true;
        }
        
        return status;
    }
    
    // toString method should show (at least) the value of the fields and the area
    public String toString()
    {
        String str;
        str = String.format("Length: %,.2f feet\nWidth: %,.2f feet\nArea: %,.2f square feet\n", length, width, area());
        
        return str;
    }
}
