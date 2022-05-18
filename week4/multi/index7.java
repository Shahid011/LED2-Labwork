package week4.multi;

import java.util.Arrays;
import java.util.Scanner;

public class index7 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(myFunc(3, 3)));
        
    }
    public static int[][] myFunc(int row, int col){
        int [][] myarr = new int[row][col];
        Scanner scr = new Scanner(System.in);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                myarr[i][j]=scr.nextInt();
            }
        }
        return myarr;
        
    }
    
}
