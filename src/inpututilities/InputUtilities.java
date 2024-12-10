/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inpututilities;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class InputUtilities {
    
    /**
     * Ask user to enter some  text - if they enter non-text (like numbers)
     * then ask them again
     * @param prompt - the question or prompt to ask the user
     * @return a String containing whatever text the user entered
     */
    
    public String askUserForText(String prompt){
        Scanner myKB=new Scanner(System.in);
        String userInput;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter text only!!");
            
            userInput = myKB.nextLine();
        }while(!userInput.matches("[a-zA-Z !.,@?\"]+"));
        //userInput must be valid text
        return userInput;
        
        //!userInput.matches("[a-zA-Z !.,@?\"]+")
    }
    
    /**
     * Ask the user to enter any integer value (negatives are allowed)
     * if they do not enter an integer ask them again
     * @param prompt the question or prompt to ask the user
     * @return a valid int entered by the user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter numbers only");
            
            userInput = myKB.nextLine();
            
        }while(!userInput.matches("[0-9]+"));
        
       
       return (Integer.parseInt(userInput));
    }
    
    /**
     * Ask user for an integer value bigger than a given minimum
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @return a valid int bigger than minValue
     */
    public int askUserForInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput= minValue -1;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter integers greater than " + minValue + " only.");
            try{
                userInput = myKB.nextInt();            
            
            }
            catch(Exception e){
                //this means user did not enter an int
                // so userInput is not changed
                System.out.println("That was not an integer value");
            }
            //keep going while userInput is less than min allowed
        }while ( (userInput < minValue));
       
        return (userInput);
        
    }
    
    /**
     * Ask user for an integer value in a given range
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid int within the given range
     */
    public int askUserForInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        
        return 0;
    }
    
    
    
}
