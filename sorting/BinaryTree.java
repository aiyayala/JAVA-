
// Binary Tree Class

package sorting;

/**
 *
 * @author mazurnm
 */
public class BinaryTree {
    private int contents;       // contents of the root node
    private BinaryTree right;   // right subtree of the root node
    private BinaryTree left;    // left subtree of the root node
    
    // returns the value in the root node
    public int getContent ()
    {
        return contents;
    }
    
    // creates and returns a leaf node containing the given value
    public BinaryTree leafNode (int value)
    {
        BinaryTree leaf;
        
        leaf = new BinaryTree ();
        leaf.contents = value;
        leaf.right = null;
        leaf.left = null;
        return leaf;
    }
   
    // adds a new right branch to a tree
    public void addRight (BinaryTree branch)
    {
        right = branch;
    }
    
    // adds a new left branch to a tree
    public void addLeft (BinaryTree branch)
    {
        left = branch;
    }
    
    // returns the right branch of the root
    public BinaryTree right ()
    {
        return right;
    }
    
    // returns the left branch of the root
    public BinaryTree left ()
    {
        return left;
    }
    
    // sets the value of the contents of the root
    public void setContent (int element)
    {
        contents = element;
        
    }
    
    // returns true if the node is leaf
    public boolean leaf ()
    {
        if (right == null && left == null)
        {
            return true;
        }
        else return false;
    }
    
    
   // print s tree in infix order
   public void printTree (int indent)
    {
            if (left != null)
                left.printTree (indent+2);
            for (int i = 0; i < indent; i++)
                System.out.print (" ");
            System.out.println (contents);
            if (right != null)
                right.printTree (indent+2);
    }
}
