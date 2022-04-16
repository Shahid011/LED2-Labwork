package CLI;

import java.util.Scanner;

public class areaOfTrinagle {
    public static void main(String[] args) {
        //Initialize variables
        float base, height, area;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        base = scr.nextFloat();
        Scanner ssr = new Scanner(System.in);
        System.out.print("Enter height of the triangle: ");
        height = ssr.nextFloat();
        
        area = (float) (0.5*base*height);

        System.out.println("Area of triangle is " +area);

        
    }
}
