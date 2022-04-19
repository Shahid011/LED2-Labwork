package homeAssignment;

import java.util.Scanner;

public class maxOfTwo {
    public static void main(String[] args) {
        float num1, num2;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        num1 = src.nextFloat();
        Scanner crs = new Scanner(System.in);
        System.out.print("Enter Num2: ");
        num2 = crs.nextFloat();

        if (num1 > num2) {
            System.out.println(+num1);
        }else {
            System.out.println(+num2);
        }

    }
    
}
