/*
Chunhong Lin 
Hw 6 
Add the gnome sort
run the sorts with data set sizes of 100,200,300,400, and 500
*/
package sorting;


import java.util.*;
import java.math.*;



public class Sorting {
    
    static int QuickCount = 0;
    static int BubbleCount = 0;
    static int GnomeCount = 0;
    
    // print an array of integers, 10 elements per line
    public static void print (int arr [])
    {
        int on_line;  // number of elements printed on line
        
        on_line = 0;
        // Print each element in turn
        for (int element : arr)
        {
            // need to go to a new line
            if (on_line == 10)
            {
                System.out.println ();
                on_line = 0;
            }
            System.out.print (element + " ");
            on_line++;
        }
    }
    
    // swap elements at indexes i1 and i2
    public static void swap (int arr [], int i1, int i2)
    {
        int swapper;
        
        swapper = arr [i1];
        arr [i1] = arr [i2];
        arr [i2] = swapper;
    }
    
    public static void BubbleSort (int arr [])
    {
        boolean swapped;  // swapped is true, if values were swapped
        int index;        // current spot in the array
        
        swapped = true;
        // continue doing passes of the array until all
        // elements are sorted
        while (swapped)
        {
            swapped = false;
            // do a pass of the algorithm
            for (index = 0; index < arr.length - 1; index++)
            {
                // if out of order swap
                BubbleCount++;
                if (arr [index] > arr [index + 1])
                {
                    swap (arr, index, index + 1);
                    swapped = true;
                }
            }
        }
     }
    public  static void GnomeSort (int arr[]){    
        //gnome sort requires the index to go backward and froward
        
        for(int index = 1; index < arr.length; ){           
                GnomeCount++;
                //keep forward if two comparing objects are in right orders
                if (arr[index-1] <= arr[index])  
                {
                    index++;   
                }
                //go backward to check 
                else 
                {   swap(arr,index-1,index);  
                    --index;
                }
                if (index ==0){
                    index = 1;}    

            }
            }
       
    // Quicksort that just generates low and high indexes
    public static void QuickSort (int arr [])
    {
        QuickSortHelp (arr, 0, arr.length - 1);
    }
    
    // recursive QuickSort, low is starting index into the
    // array section to be sorted, high is the ending index
    // into the array to be sorted
    public static void QuickSortHelp (int arr [], int low, int high)
    {
        int pivot;  // value separating sets (first in array)
        int lowMover,  // index into first part of array
            highMover; // index into last part of array
        
        // if one element, already sorted, so only concerned
        // with case of more than one element
        if (low < high)
        {
            pivot = arr [low];
            lowMover = low + 1;
            highMover = high;
            // as long as the small number is on the correct
            // side, keep moving to the right
            QuickCount++;
            while (lowMover < high && arr [lowMover] < pivot)
            {
                QuickCount++;
                lowMover++;
            }
            // as long as large number is on the correct side
            // keep moving to the left
            QuickCount++;
            while (highMover >= low && arr [highMover] > pivot)
            {
                QuickCount++;
                highMover--;
            }
            // repeat the above process as long as there are
            // values to swap
            while (lowMover < highMover)
            {
                swap (arr, lowMover, highMover);
                // as long as the small number is on the correct
                // side, keep moving to the right
                lowMover++;
                QuickCount++;
                while (lowMover < high && arr [lowMover] < pivot)
                {
                    QuickCount++;
                    lowMover++;
                }
                // as long as large number is on the correct side
                // keep moving to the left
                highMover--;
                QuickCount++;
                while (highMover >= low && arr [highMover] > pivot)
                {
                    QuickCount++;
                    highMover--;
                }
            }
            // move pivot to the middle
            swap (arr, low, highMover);
            // call recursively to sort the two "halves"
            QuickSortHelp (arr, low, highMover - 1);
            QuickSortHelp (arr, highMover + 1, high);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int set_size = 500;   //change set size of 100,200,300,400,500 
        int rand = set_size*10;
        int [] arr = new int [set_size];  // array to be sorted
        
        //initialize the arrya with random integers
         // initialize the array with random integers
        for (int i = 0; i < arr.length; i++)
            arr [i] = (int) (Math.random () * rand);
        
        System.out.println ("The original array is:");
       // print (arr);
        
        GnomeSort (arr);

        System.out.println ("\n\nThe sorted array after Bubble Sort is:");
        //print (arr);
        
        // initialize the array with random integers
        for (int i = 0; i < arr.length; i++)
            arr [i] = (int) (Math.random () * rand);
        
        System.out.println ("The original array is:");
       // print (arr);
        
        BubbleSort (arr);

        System.out.println ("\n\nThe sorted array after Bubble Sort is:");
      //  print (arr);
        
        // initialize the array with random integers
        System.out.println ("\n"); 
        for (int i = 0; i < arr.length; i++)
            arr [i] = (int) (Math.random () * rand);
        
        System.out.println ("\n\nThe original array is:");
       //print (arr);
        
        QuickSort (arr);

        System.out.println ("\n\nThe sorted array after QuickSort is:");
       // print (arr);
        System.out.println ("\n\nGnome comparisons: " + GnomeCount);
        System.out.println ("Bubble comparisons: " + BubbleCount);
        System.out.println ("QuickSort comparisons: " + QuickCount);
          
        System.out.println ("\n"); 
        
    }
}
