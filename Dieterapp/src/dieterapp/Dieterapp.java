/*
 * Chunhong Lin
 * CIS-425  Assignment 3
 * A Weight Program - create a Java Class called Dieter 
 */
package dieterapp;
import java.util.Scanner;  //import the Scanner class
/**
 *
 * @author Potato
 */
public class Dieterapp {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // scanner
        String name;              
        int weight;
        int height;        
        String command;   //string that the dieter's command(diet, party, report..etc) 
        
        System.out.print ("Enter the name: ");
        name = sc.next();                  //create an instance of name
        sc.nextLine();
        System.out.print ("Enter the weight: ");
        weight = sc.nextInt();               //create an instance of weight
        sc.nextLine();
        System.out.print ("Enter the height: ");
        height = sc.nextInt();                 //create an instance of height 
        sc.nextLine();
        Dieter newDieter = new Dieter(name, weight, height); //create a new dieter
        while(true){
            System.out.println("Enter person, diet, party, report or quit: ");
            command = sc.nextLine();
            if(command.equals("person")){
                System.out.print ("Enter the name: ");
                name = sc.next();                  //create an instance of name
                sc.nextLine();
                System.out.print ("Enter the weight: ");
                weight = sc.nextInt();               //create an instance of weight
                sc.nextLine();
                System.out.print ("Enter the height: ");
                height = sc.nextInt();                 //create an instance of height 
                sc.nextLine();
                newDieter = new Dieter(name, weight, height);
            }
            else if (command.equals("diet")){                                   
                    System.out.println(newDieter.diet());  //call the diet() from Dieter              
            }
            
            else if (command.equals("party")){
                System.out.println(newDieter.party());  //call party() from Dieter
            }
            else if (command.equals("report")){
                System.out.println(newDieter.report());  //call report() from Dieter
            }
            else if (command.equals("quit")){             
            break;   //exit the while loop
            }
            else{
            System.out.println("Invalid Input.");  
            }
        
    }    //print this line then end the program 
        //assess static method to get the total change 
        System.out.println("Total Change in Weight: " + newDieter.getTotalChange());
    }      
}

