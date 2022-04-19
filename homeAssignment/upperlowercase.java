package homeAssignment;

import java.util.Scanner;

public class upperlowercase {
    public static void main(String[] args) {
        char ch;
        Scanner src= new Scanner(System.in);
        System.out.print("Enter any character: ");
        ch = src.next().charAt(0);

        if((ch >= 'a' && ch <= 'z')){
            System.out.print(ch + " is lowercase character.");
        }else{
            System.out.print(ch + " is uppercase character.");
        }
    }
    
}
