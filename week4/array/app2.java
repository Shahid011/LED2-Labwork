package week4.array;

import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println(proOf2());
    }
    public static int proOf2(){
        int[]arr=new int[5];
        int count=0;
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            System.out.print("Enter numbers: ");
            int value=scr.nextInt();
            if(value%2==0){
                count+=1;
            }

        }
        return count;
        
    }
    
}
