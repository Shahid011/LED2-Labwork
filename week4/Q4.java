package week4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number: ");
        num2 = scr.nextInt();

        for(num1=1;num1<=10;num1++){
            System.out.println(num2 +"x" +num1+ "="+num2*num1);
        }
       
        }

    }
    

