import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Angelica Santos)
 * @version (5/21/19)
 */
public class Main
{ 
    public static void main(String[] args){ 
        int counter=0;
        int mysterynumber= 21;
        int guess;
        Scanner in = new Scanner(System.in); // declares scanner 
        System.out.println("Hello, Welcome to my number guessing game.");//welcomes user to game
        do{
        System.out.println("Pick a number:"); // asks user to pick a number 
        guess= in.nextInt(); // reads input and assigns 
        counter++;
        
        if (guess >mysterynumber) System.out.println("guess is too large");
        if (guess <mysterynumber) System.out.println("Guess is too small");
        
    } while (guess != mysterynumber);
        System.out.println("Correct");
        System.out.println(" It took " + counter + " tries ");
        
    }
}

    
    
        
    

    
    
    

