/*
Chunhong Lin
hw 7
 */
package igpay;
import java.util.Scanner;  //import the Scanner class
public class Igpay {
	public static void translator(String s){
    	String vowel = "aeiouAEIOU";   //vowel reference
    	String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   	
    	String []lst = s.split(" ");  //split the string and put it into a list
    	for(int index = 0; index<lst.length; index ++){
        	String cons;	//consnonants
        	String rest;	// rest of word
                String punctuation;
                int length = lst[index].length() - 1;
                char last_char  = lst[index].charAt(length);
                String last_punct = last_char + "";
                boolean without_punc = letter.contains(last_punct);
                if ( without_punc == false ){
                    punctuation = lst[index].substring(length);
                    lst[index] = lst[index].substring(0,length);
                }
                else{
                    punctuation = "";
                }
               
                
        	char b = lst[index].charAt(0);  //take the first character of each word
        	String bb = b+"";  	//convert the char to string for next line  	
        	boolean bbb = vowel.contains(bb); 	//yes! for this line                       	
        	if (bbb == true ){               	//if the word starts with a vowel ....
            	lst[index] = lst[index] + "way";	//just add "way" after the word
        	}
        	else{
            	for (int i = 0; i<lst[index].length(); i ++){
                	if (vowel.indexOf(lst[index].charAt(i))!=-1){
                    	cons = lst[index].substring(0,i);	//slice the word from the consnonants
                    	rest = lst[index].substring(i);  	//slice slice slice it
                    	lst[index] = rest + cons + "ay";	
                    	break;
                	}                 	
            	}            	
        	}        
                lst[index] = lst[index] + punctuation;
    	}
    	String pig = String.join(" ",lst);  //join the list
    	System.out.println(pig + "\n");   	//print the string
	
	}
	public static void main(String[] args) {
    	boolean loop = true;
    	Scanner sc = new Scanner(System.in); //create a scanner object called sc
    	System.out.println("Enter a sentence or quit: ");  //initiate the problem
    	String input  = sc.nextLine();  	
    	while(loop){
        	switch(input){
            	case "quit":
                	loop = false; 	//exit the loop
                	break;
            	default:
                	translator(input);	
                	System.out.println("Enter a sentence or quit: ");
                	input  = sc.nextLine();
        	}
    	}
    	
	}
	
}


