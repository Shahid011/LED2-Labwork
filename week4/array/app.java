package week4.array;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int [] myarray = new int[3];
        int odd = 0;
        int even =0;
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<myarray.length; i++){
            System.out.print("Enter numbers: ");
            int value = scr.nextInt();
            if(value%2==0){
                even+=1;
            }else if(value%2!=0){
                odd+=1;
            }
           }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        }
        

    }
    

