package week4.array;

import java.util.Scanner;

public class app6 {
    public static void main(String[] args) {
        reverseNum(123);
    }
    public static void reverseNum(int num){
        
        int temp=0, remainder;
        
        System.out.print("Enter number: ");
        

        while(num!=0){
            remainder = num%10;
            temp =(temp*10)+remainder;
            num =num/10;
            

        }
        System.out.println("Reverse of a Number: "+temp);
        
        
        
    }
    
}
