/*
 * Notes 2.0 made spring 2022
 */

/*v1
 * -added basic notes on printing wage
 * 
 */

//----------------------import library-------------------------
import java.util.Scanner; //gets input via text parser

//creates class
public class notes {

    //Creates method/function 
   //program starts in main()
    public static void main(String[] args) {
        /*main program*/
        
        //declare variables before assigning them, can initilize here
        int wage;
        
        //-------------Create Scanner Object------------------------//
        Scanner scnr = new Scanner(System.in); //System.in is keyboard input
        

        //-------------assign or initilize variables---------------//
        wage = 20;
        wage = scnr.nextInt(); //gets input value from keyboard/file
        
        
        //-------------display variables and sentence---------------//
        //println can calculate and display result

        System.out.print("Salary is "); // " " is a string literal
        System.out.println(wage * 40 * 52);  //displays will print on same line
        System.out.print("String literal that ");
        System.out.println("prints on same line, with new line after.");
        System.out.println("This will print on new line.");
        System.out.println("You can combine multiple items " + wage);
        
        
        
    }
    
}
