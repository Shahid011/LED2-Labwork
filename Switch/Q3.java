package Switch;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int num1, num2, num3, temp, greater;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = scr.nextInt();
        Scanner pcr  = new  Scanner(System.in);
        System.out.print("Enter num2: ");
        num2 = pcr.nextInt();
        Scanner tcr = new Scanner(System.in);
        System.out.print("Enter num3: ");
        num3 = tcr.nextInt();
        greater = Math.max(num1, num2);
        
        switch(num3>greater?1:2){
            case 1:
                System.out.println(+num3);
                break;
            case 2:
                System.out.print(+greater);
                break;
         }


        }
    }

