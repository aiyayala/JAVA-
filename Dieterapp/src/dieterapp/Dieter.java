/*
 * Chunhong Lin
 * CIS-425  Assignment 3
 * A Weight Program - create a Java Class called Dieter 
 */
package dieterapp;
import java.text.DecimalFormat; // formats decimal numbers
import java.util.Scanner;  //import the Scanner class
import java.util.Random;   // import ramdom to use math.random()

/**
 *
 * @author Potato
 */
public class Dieter {
    //the instance variables
String name;   //string that is the dieter's name
int weight;         //int that is the dieter's weight in pounds
int height;         //int that is the dieter's height in inches
double BMI;          //double that is the body mass index for the dieter
static int totalWeightChange;   //amount of weight lost/gained by all dieters

//a customer constructor with three parameters
public Dieter(String name, int weight, int height){
    this.name= name;
    this.weight= weight;
    this.height=height;
}

////public string methoid will return a string
//diet : randomly change the dieter's weight
public String diet()
{   
    int changes;                //int that is the changes of weight
    int ran;                    //variable of random number
    String output;              //string that will be print out 
    ran = getRandomNumberInRange(1,10);   //get random number in range 1 to 10
    if(ran == 1){              // 1/10 of the time it will increse the weight         
       changes =  getRandomNumberInRange(1,5);  
       output = name + " gained "+ changes + " pounds.";
       weight = weight + changes;              
       totalWeightChange = totalWeightChange + changes; //totalWeightChange
    }else{
       changes = getRandomNumberInRange(1,10);
       output = name + " lost "+ changes + " pounds."; 
       changes = - changes;            //lost weight use minus sign 
       weight = weight + changes;
       totalWeightChange = totalWeightChange + changes;
    }   
    return output;     //print out the line output
}
//party: randomly change the dieter's weight 
//same as public String diet()
public String party()     
{   
    int changes;
    int ran;
    String output;
    ran = getRandomNumberInRange(1,10);   
    if(ran == 1){       
       changes =  getRandomNumberInRange(1,5);  
       output = name + " lost "+ changes + " pounds."; 
       changes = - changes;
       weight = weight + changes;   
       totalWeightChange = totalWeightChange + changes;
    }else{
       changes = getRandomNumberInRange(1,10);
       output = name + " gained "+ changes + " pounds.";
       weight = weight + changes;
       totalWeightChange = totalWeightChange + changes;
    }   
    return output;
}
//public string methoid will return a string
//a report containign the dieter's name, weight and heith
public String report(){
    String BMIreport;
    String printReport ;  
    if (computeBMI() < 18.5 )   //condition 1 
        BMIreport = "BMI of " + computeBMI() + "  Indicates: Underweight ";
    else if (computeBMI() < 24.9 )  //condition 2
        BMIreport = "BMI of " + computeBMI() + "  Indicates: Normal weight ";
    else if (computeBMI() < 29.9)   //condition 3
        BMIreport = "BMI of " + computeBMI() + "  Indicates: Overweight ";
    else
        BMIreport = "BMI of " + computeBMI() + "  Indicates: Obese";
    
    printReport = "Report for " + name + "\n    Weight: " + weight + 
            "\n    Height: " + height + "\n" +  BMIreport + "\n";
    return printReport;  //return a string 
}

//private methoid , no parameter
// returns a double value which is the dieter's body mass 
//index BMI
private double computeBMI(){
    DecimalFormat df = new DecimalFormat("#.##");   //round the decimal 
    //return a double value with 2 decimal points 
    return Double.valueOf(df.format(703* (double)weight /(height * height)));   //BMI
}

//a class that taks no parameters
//simply return the total weight of change
//must be public, so that we can use in Dieterapp
public static int getTotalChange(){
    return totalWeightChange;
}

//a private method to get random number in range 
//copy from stackoverflow, "Generating Random Number between 1 and 99 inclusive?"
private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
    }
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}

}
