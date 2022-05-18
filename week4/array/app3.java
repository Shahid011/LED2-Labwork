package week4.array;

import java.nio.IntBuffer;
import java.sql.Array;
import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println(returnArray());;
    }
    public static  int[] returnArray(){
        int[]arr=new int[5];
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Array Elements: ");
            int value = scr.nextInt();
        }
        return arr;
        

        
        }
        
    }

