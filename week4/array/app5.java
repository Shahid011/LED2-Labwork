package week4.array;

import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        System.out.println(factor());;
        
    }
    public static int factor(){
        int []myarr=new int[3];
        int sum=0;
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<myarr.length;i++){
            System.out.print("Enter array number: ");
            int value = scr.nextInt();
            if(value%5==0 && value%11==0){
                sum+=1;
                value++;
            }

        }
    return sum;
    }
    
}
