package homeAssignment;

import java.util.Scanner;

public class myapp {
    public static void main(String[] args) {
        char ch;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter any char: ");
        ch = src.next().charAt(0);

        if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.print(ch +" is alphabet!!");

        }else if((ch>=0)){
            System.out.print(ch + " is a number.");
        } else if((ch == '.' && ch == '.' && ch==',' && ch == '/')) {
            System.out.print(ch + " is a special character!");
        }
    }
    
}
