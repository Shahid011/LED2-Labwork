package week4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        num1=src.nextInt();

        for(num2=0; num2<=10; num2++){
            System.out.println(num1+"x"+num2+"="+num1*num2);
        }
    }
}
