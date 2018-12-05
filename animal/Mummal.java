/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildkingdom;

import java.text.DecimalFormat;

/**
 *
 * @author Potato
 */
public class Mummal extends Animal {


public Mummal(){
    flies = false;  //constructor nots that the animal can fly
    }

@Override
public double FastTime(double distance) //abstract method
    {   
        double time;
        time = distance/landSpeed;
        DecimalFormat df = new DecimalFormat("0.00");  //formatting
        return Double.parseDouble(df.format(time));  //returns 2 decimal points
    }
 
}