import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Main here.
 *
 * @author (Angelica Santos)
 * @version (5/21/19)
 */
public class Main
{ 
    public static void main(String[] args){ 
        Random randomNumber = new Random ();
     
        int counter=0;
        int mysterynumber= randomNumber.nextInt(10);
        int guess=0;
        int previousNum=0;
        
        Scanner in = new Scanner(System.in); // declares scanner 
        System.out.println("Hello, Welcome to my number guessing game.");//welcomes user to game
        do{
        System.out.println("Pick a number:"); // asks user to pick a number 
        guess= in.nextInt(); // reads input and assigns 
        
        
        if (guess >mysterynumber){
            System.out.println("guess is too large");
        }
        else if (guess <mysterynumber) {
            System.out.println("Guess is too small");
            }
            if (guess != previousNum) {
                counter++; 
                previousNum=guess; 
                
            }
           
            
            
            
    } while (guess != mysterynumber);
        System.out.println("Correct");
        System.out.println(" It took " + counter + " tries ");
        
    }
}

    
    
        
    

    
    
    

