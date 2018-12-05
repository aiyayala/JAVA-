/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Potato
 */
public abstract class Mammal {
    protected String kind;   //kind is the name of the animal
    protected double airSpeed, landSpeed; // miles/hour  
    protected boolean flies; //true if the animal can fly
    
public Mammal(boolean f){
   // kind = k;
   //landSpeed = l;
   // airSpeed = a;
    flies = f;  
    }
public abstract double FastTime(double distance);
  
public void print(){
        System.out.println("Kind:         " + kind);
        System.out.println("Air Speed:    " + airSpeed);
        System.out.println("Land Speed:   " + landSpeed);
        System.out.println("Can Fly:      " + flies);
    }

}