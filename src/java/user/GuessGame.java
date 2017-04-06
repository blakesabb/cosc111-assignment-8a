/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 *
 * @author mochan
 */
public class GuessGame {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries = 1;
    
    // Generate a new number for the user to guess
    public void generateNum() {        
        num = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        tries = 0;
    }
    
    // Getters and setters
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGuess() {
     

        return guess;
        
    }

    public void setGuess(int guess) {
         
        allGuesses = allGuesses + guess + "<br>";
        System.out.print(allGuesses);
        this.guess = guess;
    }

    public String getAllGuesses() 
    {
        
        return allGuesses;
        
    }
    
    public void setAllGuesses(String allGuesses)
    {
        this.allGuesses = allGuesses;
    }
    
    public int getTries() {

        return ++tries;
    }

    public void setTries(int tries) {
        Scanner input = new Scanner(System.in);
       
        
        guess = input.nextInt();
            tries++;
               
            
        
    }
    
    
    
    private String allGuesses = " ";

    public int AllGuesses()
            {
    System.out.print(guess);
              return guess;  
            }

            
}  

