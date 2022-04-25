package Switch;

import java.util.Scanner;

public class Q6 {
    
    public static void main(String[] args) {
        //7. JAVA Program to take the value from the user as input any alphabet and check whether it is
        //vowel or consonant. Using the switch statement.
      char ch, z;
      Scanner scr = new Scanner(System.in);
      System.out.print("Enter any char: ");
      ch = ((scr.nextLine()).charAt(0));
      z= Character.toUpperCase(ch);

      switch(z){
        case 'A':
            System.out.print(ch+" is vowel.");
            break;
        case 'E':
            System.out.print(ch+ " is a consonent.");
            break;
        case 'I':
            System.out.print(ch+  "is vowel");
            break;

        case 'O':
            System.out.print(ch+ " is a vowel");
            break;
        case 'U':
            System.out.print(ch+ "is a vowel");
            break;
        default:
            System.out.print("Invalid Input!!");
            break;


      }
        

        
    }
}
