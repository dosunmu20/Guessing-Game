
package javaapplication1;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Player { 
   private int guessedNumber = 0; 
    Random rand = new Random();
    
    public int guess(){
        guessedNumber = rand.nextInt(11);
         return guessedNumber;
    }
    
}
