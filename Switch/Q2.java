package Switch;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = scr.nextInt();
        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter num2: ");
        num2 = pcr.nextInt();


        switch((num1>num2?1:2)){
            case 1:
                System.out.println("Num 1 is max.");
                break;
            case 2:
                System.out.println("Num2 is max.");
                break;
        }

    }
}
