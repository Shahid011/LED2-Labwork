package week4.multi;

import java.util.Arrays;
import java.util.Scanner;

public class index4 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(myFunc()));
    }
    public static String[][] myFunc(){
        int row=2, col=3;
        String value;
        String [][] arr = new String[row][col];
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter array elements:");
        
        for(int i=0; i<row; i++){
            
            for(int j=0; j<col; j++){
                value = scr.next();
                arr[i][j]= value;
            }
        }
        return arr;
        
    }
    
}
