package week4.multi;

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        System.out.println(createArray(2, 2));;
        
    }
    public static String[][] createArray(int row, int col){
        String [][]array = new String[row][col];

        Scanner src = new Scanner(System.in);
        for(int i=0; i<row; i++){
            
            for(int j=0; j<col; j++){
                
            array[i][j]=src.next();
            }
        
        }
        
        return array;
  
    }
    
}
