package homeAssignment;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        float side1, side2, side3;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle: ");
        side1 = scr.nextFloat();
        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter 2nd side of triangle: ");
        side2 = pcr.nextFloat();
        Scanner mcr = new Scanner(System.in);
        System.out.print("Enter 3rd side of triangle: ");
        side3 = mcr.nextFloat();
        
        if(side1 == side2 && side2 == side3){
            System.out.print("This is equilateral triangle.");
        }else if(side1 == side2 && side1 != side3){
            System.out.print("This is scalen triangle.");
        }else {
            System.out.print("This is isoceles triangle.");
        }
    }
}
