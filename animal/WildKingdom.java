/*
Chunhong Lin
CIS425-Hw4
Wild kingdom
 */
package wildkingdom;
import java.util.Scanner;  //import the Scanner class

public class WildKingdom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in); // scanner
        String choice = "bat";  //perform  1 or more slections
        while (!choice.equalsIgnoreCase("quit"))          //the loop will keep going until choice equals quit
        {
            System.out.println("Enter an animal (or quit): ");          //prompt for animal kind  
            choice = sc.next();                                         //read the animal kind
            sc.nextLine();                                              //discard any other data entered on the line
            
            switch (choice){
                case "bat":     
                    System.out.println("Enter a distance to travel: ");              //prompt for distance to travel 
                    double dis = sc.nextDouble();                                 //read the distance 
                    sc.nextLine();        //discard any other data entered on the line
                    Animal p = new Bat ();      // create a bat object and assign it  to animal 
                    p.print();                   //call the print function
                    System.out.println("\nTime for trip: "+  p.FastTime(dis)+ " hours\n");
                    break;
                            
                case "cow":
                    System.out.println("Enter a distance to travel: ");              //prompt for distance to travel 
                    double dis2 = sc.nextDouble();                                 //read the distance 
                    sc.nextLine();        //discard any other data entered on the line
                    Animal q = new Cow ();            // create a cow object and assign it  to animal                 
                    q.print();                        //call the print function
                    System.out.println("\nTime for trip: "+  q.FastTime(dis2)+ " hours\n");
                    break;
                
                case "hawk":
                    System.out.println("Enter a distance to travel: ");              //prompt for distance to travel 
                    double dis3 = sc.nextDouble();                                 //read the distance 
                    sc.nextLine();        //discard any other data entered on the line
                    Animal r = new Hawk ();                          // create a hawk object and assign it  to animal    
                    r.print();                       //call the print function
                    System.out.println("\nTime for trip: "+  r.FastTime(dis3)+ " hours\n");
                    break;

                case "penguin": 
                    System.out.println("Enter a distance to travel: ");              //prompt for distance to travel 
                    double dis4 = sc.nextDouble();                                 //read the distance 
                    sc.nextLine();        //discard any other data entered on the line
                    Animal s = new Penguin ();         // create a penguin and assign it  to animal 
                    s.print();              //call the print function 
                    System.out.println("\nTime for trip: "+  s.FastTime(dis4)+ " hours\n");
                case "quit": 
                    break;                               //quit the switch
            }
            
        
        }
        
        
        
    }
    
}
