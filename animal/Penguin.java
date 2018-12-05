/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildkingdom;

import java.text.DecimalFormat;

/**
 *
 * @author linc01
 */
public class Penguin extends Bird{
  
public Penguin(){
    kind = "Penguin";
    flies = false;
    landSpeed = 1.5;
    airSpeed = 0;
  
}

@Override
public double FastTime(double distance) //abstract method
    {   double time;
        time = distance/landSpeed;            //override the bird class
        DecimalFormat df = new DecimalFormat("0.00");  //formatting
        return Double.parseDouble(df.format(time));  //returns 2 decimal points
    }    

}

