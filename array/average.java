package week4.array;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int [] Arr= new int[]{1,2,3,4,5};
        float average;
        int sum;
        for(int i=0; i<=Arr.length; i++){
             sum = Arr[i] + Arr[i-1];


            average = sum/Arr.length;
            

        }
        
    }
    
    
}


//Write a Java program to calculate the average value of array element.
class Average {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        float average;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println("Average value of array elements: " + average);
    }
}