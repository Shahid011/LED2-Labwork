package week4.multi;

import java.util.Arrays;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int row=2,col=2;
        int [][]myarr=new int[row][col];
        Scanner src =new Scanner(System.in);
        for(int i=row;i<row; row++ ){
            for(int j=0; j<col;j++){
                int value = src.nextInt();
                myarr[i][j]=value;
            }
    
        }
        System.out.println(Arrays.deepToString(myarr));
    }

    
}
