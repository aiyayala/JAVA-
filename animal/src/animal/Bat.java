/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;
import java.util.Scanner;  //import the Scanner class
/**
 *
 * @author Potato
 */
public class Bat extends Mammal 
{  
    Scanner sc = new Scanner (System.in); // scanner
    private String kind;   
    private double landSpeed;      
    private double airSpeed;
    private boolean flies;
    
    // constructor sets all protected and private data for
    // the bat
    public Bat (String k, double l, double a, boolean f){
        super(k,l,a,f);
        kind = k;
        landSpeed = l;
        airSpeed = a;
        flies = f;  
    }
    
    public double FastTime(double distance) //abstract method
    {   double time;
        time = distance/airSpeed;
        return time;
    }

    
    public boolean canfly(){
        return "Yes";      
    }
}
