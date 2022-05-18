package week4.multi;

import java.util.Arrays;
import java.util.Scanner;

public class index5 {
    public static void main(String[] args) {
        /**
         * Add 2x3 Array
         */
      
        System.out.println(myfunc());
    }
    public static int myfunc(){
        int row=2, col=3,value, sum=0;
        int [][]myarr = new int[row][col];
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<row; i++){
            
            for( int j=0; j<col; j++){
               
                value=scr.nextInt();
                sum+=value;
            }
        
        }
        return sum;
    
        
    }
    
}
