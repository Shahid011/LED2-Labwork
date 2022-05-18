package week4;

public class Q8 {
    /**
     * Write a program to find the factorial value of any number entered through the
        keyboard.
     */
   public static void main(String[] args) {
    int i,fact=1;  
    int number=5;//It is the number to calculate factorial    
    for(i=1;i<=number;i++){    
        fact=fact*i;    
    }    
    System.out.println("Factorial of "+number+" is: "+fact);    
   }

    



   }

