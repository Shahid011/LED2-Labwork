package CLI;

import java.util.Scanner;

public class volumeOfCubiod {
    public static void main(String[] args) {
        //Initialize variables
        float length,height,width, volume;
        Scanner len = new Scanner(System.in);
        System.out.print("Enter length of cuboid: ");
        length = len.nextFloat();
        Scanner wid = new Scanner(System.in);
        System.out.print("Enter width of cuboid: ");
        width = wid.nextFloat();
        Scanner hei = new Scanner(System.in);
        System.out.print("Enter height of cuboid: ");
        height = hei.nextFloat();

        volume = length*width*height;

        System.out.println("The volume of cube is " +volume);
    }
}
