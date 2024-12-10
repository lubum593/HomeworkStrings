/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkstrings;

import inpututilities.InputUtilities;

/**
 *
 * @author Luis
 */
public class HomeworkStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputUtilities myInput = new InputUtilities();
        String name= myInput.askUserForText("Hello, please input your Name ");
        
        System.out.println("Welcome "+name+", choose what would you like to do?");
        System.out.println("Option 1: Reverse your name.");
        System.out.println("Option 2: UpperCase your name.");
        System.out.println("Option 3: Is your name Palindome?");
        System.out.println("Option 4: Replace the vowels of your name.");
        System.out.println("Option 5: Replace only the first vowel of your name.");
        int choice = myInput.askUserForInt("Insert your option: ");
        switch(choice){ //Using switch to choose the option the user decide to use.
            case 1:
                System.out.println(reverseString(name));
                break;
            case 2:
                System.out.println(convertToUpperCaseName(name));
                break;
            case 3:
                System.out.println(isPalindome(name));
                break;
            case 4:    
                System.out.println(ReplaceVowels(name));
                break;
            case 5:    
                System.out.println(ReplaceFirstVowel(name));
                break;    
        }
        
        
    }
    
     
    //With a loop was created that in based of the String Length and substring, from the back to the beggining we concated the original String.
    public static String reverseString(String name){
        int stringLength = name.length();
        String reverseName="";
        for (int i = stringLength; i > 0; i--) { //We start the loop from the length of the name
            reverseName = reverseName+name.substring(i-1,i); //We concat from the last letter to the fisrt
        }
        return reverseName;
    }
    
    
    public static String convertToUpperCaseName(String name){    
        return name.toUpperCase(); //Using this Method to UpperCase
    }
    
    //In this method we check if a name is the same if it is reversed. Names like Ana, Hannah are palindrome
    public static String isPalindome(String name){
        String reverseName = reverseString(name); //I reused the method reverseName
        String answer;
        if (name.equalsIgnoreCase(reverseName)) { //here this condition is going to check if it is the same ignoring Case.
            answer = "Your name "+name+ " is a Palindrome";          
        }else{
            answer = "Your name "+name+ " is not a Palindrome";
        }        
        return answer;
    }
    
    public static String ReplaceVowels(String name){
        String answer;
        if (checkIfHasVowels(name)==true) {//We call a function to check if there is any vowel in the name
            answer = name.replaceAll("[aeiouAEIOU]", "@");//We replace all the vowels for @
        }else{
            answer = "Are you sure your name does not have vowels?... That is suspicious..."; //In case the name doesn't have any vowels
        }
        return answer;
    }
    
    public static boolean checkIfHasVowels(String name){    
        String vowels = "aeiouAEIOU";
        boolean answer=false;
        for (int i = 0; i < vowels.length(); i++) { //In this loop with check if the name contains a vowel.
            if (name.contains(vowels.substring(i,i+1))) {//Using substring we check each letter of the string if it contains a vowel
                answer = true;
            }
        }
        //System.out.println(answer);    
        return answer;
    }
    
    
    
    public static String ReplaceFirstVowel(String name){
        String answer;
        if (checkIfHasVowels(name)==true) {//We call a function to check if there is any vowel in the name
            answer = name.replace(FirstVowel(name), "#");//We replace ONLY the first vowel for # using the Function called FirstVowel
        }else{
            answer = "Are you sure your name does not have vowels?... That is suspicious..."; //In case the name doesn't have any vowels
        }
        return answer;
    }
    
    public static String FirstVowel(String name){    
        String vowels = "[aeiouAEIOU]";
        String letter;
        boolean firstVowel = false;
        int counter=0;
        String answer = "";
        while(firstVowel == false){ //With a loop waiting to find the first vowel
            letter = name.substring(counter,counter+1);
            if (letter.matches(vowels)) {
                answer = letter;
                firstVowel=true; //once is found we change to true to return that letter only
            }
            counter++;
        }
        return answer;
    }
    
}
