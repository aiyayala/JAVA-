/*
 *  Chuhong Lin
    CIS 425
    Assignment-2 : Write a java application that computes sums and  products of integeres  
    between 2 endpoints.

??  After the first run, there are two invalid lines that I can not get rid off.
??  Enter add, multiply, or quit: 
??  Must enter add, multiply or quit!
 */
package exception;
import java.util.Scanner;  //import the Scanner class
import java.util.InputMismatchException;   //import exception
import java.lang.Math;
import static java.lang.Math.floor;
public class Exception { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int low = 0;  //low value
        int high = 0; //high value
        int a; 
        Scanner sc = new Scanner(System.in); //create a scanner object called sc   
        a = (int) floor (Math.random());
        
        System.out.println(a + "aaaa");
        System.out.println("Enter add, multiply, or quit: ");   //print the question
        String command = sc.nextLine();                         //assign the input value to command     
        while(true){                       
        switch(command){                                             
            case "add":                
                try{
                    System.out.println("Enter the low bound for add: ");
                    low = sc.nextInt();                  //assign the input to int value
                }
                catch(InputMismatchException e){
                    sc.next();      //discard the invalid numnber
                    System.out.println("Low value must be an integer \n");                      
                    continue;             //jump to the top of the loop
                }     
                
                while(true){
                    System.out.println("Enter the high bound for add: ");
                    if(sc.hasNextInt()){
                        high = sc.nextInt();          //no exception, high equals the input value
                        break;                        //exit the loop
                    }    
                    else{
                        sc.next();                    //discard the invalid numnber
                        System.out.println("High value must be an integer \n");     
                        }
                }
                while(low>high){
                    System.out.println("High value must be greater or equal to low value.");
                    while(true){
                        System.out.println("Enter the high bound for add: ");
                        if(sc.hasNextInt()){
                            high = sc.nextInt();          //no exception, high equals the input value
                            break;                        //exit the loop
                        }    
                        else{
                            sc.next();                    //discard the invalid numnber
                            System.out.println("High value must be an integer \n");     
                            }
                } }              
                System.out.println("\n Sum of values from "+ low + " to " + high
                + " : " + summation(low,high)+"\n");    //print the result
            break;                                      //exit case "add"

            case "multiply":
                try{
                    System.out.println("Enter the low bound for multiply: ");
                    low = sc.nextInt();
                }
                catch(InputMismatchException e){
                    sc.next();                      //discard the invalid numnber
                    System.out.println("Low value must be an integer");
                    continue;                       //jump to the top of the loop
                }           
                while(true){
                    System.out.println("Enter the high bound for multiply: ");
                    if(sc.hasNextInt()){
                        high = sc.nextInt();
                        break;                  //exit the while loop
                    }    
                    else{
                        sc.next();                   //discard invalid value
                        System.out.println("High value must be an integer \n");      
                        }
                }
                while(low>high){
                    System.out.println("High value must be greater or equal to low value.");
                    while(true){
                        System.out.println("Enter the high bound for multiply: ");
                        if(sc.hasNextInt()){
                            high = sc.nextInt();
                            break;                  //exit the while loop
                        }    
                        else{
                            sc.next();                   //discard invalid value
                            System.out.println("High value must be an integer \n");      
                            }
                } }
                System.out.println("\n Product of values from "+ low + " to " + high
                + " : " +multation(low,high)+"\n"); 
                break;  //exit case"multiply"
            case "quit":              
                return;   //exit the project
            default:
                System.out.println("Must enter add, multiply or quit!\n");
                break;    //exit default 
        }
        System.out.println("Enter add, multiply, or quit: ");
        command = sc.nextLine();      //record the input and jump to the top
        }
    }    
    public static int summation(int low, int high){
    //static method that computes and returns the sum of two integers 
    int sum = 0;
    for(int i =low; i<high+1; i = i+1)
        sum = sum + i;
    return sum;  //return summation value 
    }
    public static int multation (int low, int high){
    //static method that computes and returns the product of two integers
    int product = 1;
    for (int i = low; i<high+1;i=i+1)
        product = product*i;
    return product; //return product value 
    }
}
