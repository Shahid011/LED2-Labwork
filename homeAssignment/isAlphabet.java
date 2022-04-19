package homeAssignment;

import java.util.Scanner;

public class isAlphabet {
    public static void main(String[] args) {
        char ch;//Declare variable
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = src.next().charAt(0); // initailize char

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.print(ch+" is an alphabet");
        }else{
            System.out.print(ch+" is not an alphabet");

        }
    }
    
}
