package Switch;

import java.security.AllPermission;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //8. JAVA Program to take the value from the user as input any character and check whether it is
        //the alphabet, digit or special character. Using the switch statement. 
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any char: ");
        ch = (scr.next().charAt(0));
        

        switch((ch>='a'&& ch<='z'||ch>='A' && ch<='Z') ?1:2){
            case 1:
                System.out.print("alphabet");
                break;
            case 2:
                System.out.print("digit");
                break;
            default:
                System.out.print("Special character");
                break;
        }

        
    }
}
