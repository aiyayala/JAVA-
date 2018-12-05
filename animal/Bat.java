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
public class Bat extends Mummal{

   
public Bat(){
    kind = "Bat";
    flies = true;
    landSpeed = 1;
    airSpeed = 22;
  
}

@Override
public double FastTime(double distance) //abstract method
    {   double time;
        time = distance/airSpeed;            //override the mammal class 
        DecimalFormat df = new DecimalFormat("0.00");  //formatting
        return Double.parseDouble(df.format(time));  //returns 2 decimal points
    }    

}

