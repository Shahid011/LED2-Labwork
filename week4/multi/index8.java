package week4.multi;

import java.util.Scanner;

public class index8 {
    public static void main(String[] args) {
        System.out.println(sumValue(2));
       
        
    }
    public static int sumValue(int n){
        int []myArr=new int[5];
        int value,sum=0;
        Scanner scr = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter array elements: ");
            value = scr.nextInt();
            if(value%n==0){
                sum+=value;
            }
        }
        return sum;
        
        
    }
    
}
