package week4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /**
         * Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed. For example, if the input is 12345, the output
        should be 54321.
         */
        int number = 987654, reverse = 0;  
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse); 
        
        
    }
    
}
