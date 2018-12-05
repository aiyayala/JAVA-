
package sorting;


import java.util.*;
import java.math.*;


/*

Sorts an array using a binary tree sort

 */


public class Sorting {
    
    static int TreeCount = 0;   // the number of comparisons made by the
                                // tree sort algorithm
    static int SortIndex = 0;   // the current index used when writing a
                                // the binary sort tree back to the array
    
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
    
   
    // adds a new element, number, to the Binary Search Tree
    public static void insertElement (BinaryTree sortTree, int number)
    {
        BinaryTree newLeaf = new BinaryTree ();

        if (sortTree.leaf ())
            {
                newLeaf = newLeaf.leafNode (number);
                TreeCount++;
                if (sortTree.getContent () > number)
                {
                    sortTree.addLeft (newLeaf);
                }
                else
                {
                    sortTree.addRight (newLeaf);
                }
            }
        else // not a leaf
            {
                TreeCount++;
                if (sortTree.getContent () > number)
                {
                    if (sortTree.left () != null)
                        insertElement (sortTree.left (), number);
                    else 
                    {
                       newLeaf = newLeaf.leafNode (number);
                       sortTree.addLeft (newLeaf);
                    }
                }
                else
                {
                    if (sortTree.right () != null)
                        insertElement (sortTree.right (), number);
                    else
                    {
                        newLeaf = newLeaf.leafNode (number);
                        sortTree.addRight (newLeaf);
                    }
                }
            }
    }
    
    // traverses the binary search tree in infix order, putting the now
    // sorted elements into the array
    public static void treeToArray (BinaryTree sortTree, int arr [])
    {
           if (sortTree.left () != null)
                treeToArray (sortTree.left (), arr);
            arr [SortIndex] = sortTree.getContent ();
            SortIndex++;
            if (sortTree.right () != null)
                treeToArray (sortTree.right (), arr);
    }
    
    public static void BinaryTreeSort (int arr [])
    {
        BinaryTree sortTree = new BinaryTree ();
        
        sortTree = sortTree.leafNode (arr [0]);
        for (int i = 1; i < arr.length; i++)
            insertElement (sortTree, arr [i]);
        SortIndex = 0;
        treeToArray (sortTree, arr);
    }
       
    public static void main(String[] args) {
        int [] arr = new int [1000];  // array to be sorted
        
        // initialize the array with random integers
        for (int i = 0; i < arr.length; i++)
            arr [i] = (int) (Math.random () * 10000);
        
        // initialize the array with random integers
        for (int i = 0; i < arr.length; i++)
            arr [i] = (int) (Math.random () * 10000);
        
        System.out.println ("The original array is:");
        print (arr);
        
        BinaryTreeSort (arr);

        System.out.println ("\n\nThe sorted array after Binary Tree Sort is:");
        print (arr);
        
        System.out.println ("\nBinary Tree Sort comparisons: " + TreeCount);
        System.out.println ("\n"); 
    }
}
