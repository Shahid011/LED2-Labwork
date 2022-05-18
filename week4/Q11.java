package week4;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /**
         * Write a program that reads a set of integers, and then prints the sum of the even
        and odd integers.
         */
        
        int number, i, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
    }
    
}
