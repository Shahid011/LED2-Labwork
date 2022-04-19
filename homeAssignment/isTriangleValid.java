package homeAssignment;

import java.util.Scanner;

public class isTriangleValid {
    public static void main(String[] args) {
        float angle1, angle2, angle3;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter 1st angle of triangle: ");
        angle2  = scr.nextFloat();
        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter 1st angle of triangle: ");
        angle3  = pcr.nextFloat();
        Scanner ncr = new Scanner(System.in);
        System.out.print("Enter 1st angle of triangle: ");
        angle1  = ncr.nextFloat();

        if((angle1+angle2+angle3)==180){
            System.out.println("The triangle is valid.");
        }else{
            System.out.println("The triangle is not valid.");
        }
    }
    
}
