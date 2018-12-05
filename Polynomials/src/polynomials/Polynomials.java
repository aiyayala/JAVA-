/*
 * Chunhong Lin
 *CIS 425 HW8 -wORKING THE QUADS
 *DUE:Nov/20/2018
 *Write a JavaFX GUI application that works with second order ploynomials.
 */
package polynomials;

import javafx.application.Application;  // allow an FX application
import javafx.scene.Scene;   // To have a Scene
import javafx.scene.layout.GridPane;   // the GridPane
import javafx.stage.Stage;             // the Stage
import javafx.scene.control.Label;     // the Labels
import javafx.geometry.Insets;         // padding on edges
import javafx.geometry.Pos;            // positions
import javafx.scene.control.TextField; // text fields
import javafx.scene.control.Button;    // buttons
import javafx.scene.layout.HBox;       // Horizontal box
import javafx.event.EventHandler;      // handle event
import javafx.event.ActionEvent;       // for setOnActionEvent
import java.lang.Math;
/**
 *
 * @author Chunhong Lin
 */
public class Polynomials extends Application {
        
   // declare and instantiate the text fields
   private TextField aText = new TextField ();
   private TextField bText = new TextField ();
   private TextField cText = new TextField ();
   private TextField xText = new TextField ();
   private TextField yText = new TextField ();
   private TextField rootText = new TextField ();
   private Label lbl_y = new Label ("f(x)");
   private Label lbl_roots = new Label ("Roots");     
   private Label lbl_equations = new Label("  ");

    // start method that sets up all the GUI elements
    // in the stage
    @Override
    public void start (Stage primaryStage)
    {
        // declare a label
        Label lbl_a = new Label ("a");
        Label lbl_b = new Label ("b");
        Label lbl_c = new Label ("c");
        Label lbl_x = new Label ("x");
        
        
        // title the window
        primaryStage.setTitle ("Quadratic Equation");
        // create the grid, scene and add the grid to the scene
        GridPane grid = new GridPane ();
        Scene scene = new Scene (grid, 430, 200);
        
        // add labels to the grid
        grid.add (lbl_a, 0, 0);
        grid.add (lbl_b, 0, 1);
        grid.add (lbl_c, 0, 2);
        grid.add (lbl_x, 2, 0);
        grid.add (lbl_y, 2, 1);
        grid.add (lbl_roots, 2, 2);
        lbl_y.setVisible(false);
        lbl_roots.setVisible(false);
        //equation
        grid.add (lbl_equations, 1, 3);
        lbl_equations.setVisible(false);

        
        
        // format the GUI some
        grid.setAlignment (Pos.TOP_LEFT);
        grid.setPadding (new Insets (20,20,20,20));
        grid.setHgap (5);
        grid.setVgap (5);
                
        // add the TextFields to the grid
        grid.add (aText, 1, 0);
        grid.add (bText, 1, 1);
        grid.add (cText, 1, 2);
        grid.add (xText, 3, 0);
        grid.add (yText, 3, 1);
        grid.add (rootText, 3, 2);
        yText.setEditable (false);
        yText.setVisible(false);
        rootText.setEditable (false);
        rootText.setVisible(false);
        
        
        
        // Declare and Instantiate the Buttons
        Button showbtn = new Button ("Show Equation");
        Button findbtn = new Button ("Find Roots");
        Button evaluatebtn = new Button ("Evaluate for x");
        Button clearbtn = new Button ("Clear");
        Button exitButton = new Button ("Exit");
        
        // prior to Java 8, override the normal handle method
        exitButton.setOnAction (new EventHandler < ActionEvent> ()
        {
          @Override 
          public void handle (ActionEvent event)
          {
             exitButtonClicked ();    
          }
        });
        // after Java 8, specify code directly for the event
        showbtn.setOnAction (event -> {showbtnClicked ();});
        findbtn.setOnAction (event -> {findbtnClicked ();});
        evaluatebtn.setOnAction (event -> {evaluatebtnClicked ();});
        clearbtn.setOnAction (event -> {clearbtnClicked ();});
        
        
        // create an HBox to hold the buttons
        HBox buttonBox = new HBox (10);  // separate items by 10 pixels
        buttonBox.getChildren().add (showbtn);
        buttonBox.getChildren().add (findbtn);
        buttonBox.getChildren().add (evaluatebtn);
        buttonBox.getChildren().add (clearbtn);
        buttonBox.getChildren().add (exitButton);
        buttonBox.setAlignment (Pos.BOTTOM_LEFT);
        grid.add (buttonBox, 0, 4, 5, 1);
        
        // display the window
        primaryStage.setScene (scene);
        primaryStage.show ();
    }
    
    // code executed when exitButton is clicked, ends the
    // application
    private void exitButtonClicked ()
    {
        System.exit (0);
    }
    
    
    // function runs when Calculate button is pressed, adds
    // the fractions in the two fields and places the result
    // in the answer field
    private void showbtnClicked ()
    {
        String a, b,c;  // the user input fractions     
        String answer;       // Fraction answer String to 
                             // to write out
        
        // get fraction strings from fields
        a = aText.getText ();
        b = bText.getText ();
        c = cText.getText ();   
        answer = "Equation: "+ a + "x^2 + " + b+ "x + " + c ;
        lbl_equations.setText(answer);
        lbl_equations.setVisible(true);
    }
     private void findbtnClicked ()
    {
        String aa,bb,cc;
        double root1,root2,checkimaginary;
        double a,b,c;
        String answer;
        
        aa = aText.getText ();
        bb = bText.getText ();
        cc = cText.getText (); 
        a = Double.parseDouble(aa); 
        b = Double.parseDouble(bb);
        c = Double.parseDouble(cc);
        root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        checkimaginary = b*b - 4*a*c;
        if (checkimaginary < 0 )
            answer = "Imaginary Roots";
        else if(checkimaginary > 0)
            answer =  Double.toString (root1)+ "," + Double.toString (root2);
        else
            answer = Double.toString(root1)+" (one root)";
        rootText.setText(answer);
        rootText.setVisible(true);
        lbl_roots.setVisible(true);
        
        
    }
      private void evaluatebtnClicked ()
    {
        String aa,bb,cc,xx;
        double a,b,c,x;
        String answer;
        
        aa = aText.getText ();
        bb = bText.getText ();
        cc = cText.getText (); 
        xx = xText.getText();
        a = Double.parseDouble(aa); 
        b = Double.parseDouble(bb);
        c = Double.parseDouble(cc);
        x = Double.parseDouble(xx);    
        answer = Double.toString(a*x*x + b*x + c);
        yText.setText(answer);
        yText.setVisible(true);
        lbl_y.setVisible(true);
        
    }
       private void clearbtnClicked ()
    {   
        aText.setText("");
        bText.setText("");
        cText.setText("");
        xText.setText("");    
        lbl_equations.setVisible(false);  //equations
        rootText.setVisible(false);
        lbl_roots.setVisible(false);
        yText.setVisible(false);
        lbl_y.setVisible(false);
    }
    
    public static void main(String[] args) {
        launch (args);
    }

    
    
}
