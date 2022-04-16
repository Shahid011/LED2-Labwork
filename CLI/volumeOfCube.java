package CLI;

import java.util.Scanner;

public class volumeOfCube {
    public static void main(String[] args) {
        //Intialize variables
        float length, volume;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the lenght of cube: ");
        length = scr.nextFloat();
        volume = length*length*length;
        


        System.out.println("volume of cubiod is " +volume);

    }
    
}
