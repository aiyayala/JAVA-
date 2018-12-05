/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildkingdom;

/**
 *
 * @author Potato
 */
//animal is the abstract class
public abstract class Animal {

    protected String kind;   //kind is the name of the animal
    protected double airSpeed, landSpeed; // miles/hour  
    protected boolean flies; //true if the animal can fly
    

public abstract double FastTime(double distance);
  
public void print(){
        System.out.println("Kind:                 " + kind); 
        System.out.println("Air  Speed:           " + airSpeed); 
        System.out.println("Land Speed:           " + landSpeed); 
        System.out.println("Can fly:              " + fly(flies)); //call fly()
    }

//if the boolean returns true
//the bird can fly. It will print "Yes"
//else the bird can not fly. It will print "No"
public String fly(boolean f){
    String canfly;
    if (f == true)
        canfly = "Yes";
    else
        canfly = "No";
    return canfly;
    }

}
