package Switch;

import java.util.Scanner;

public class Q4 {
    //4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
    //statement.
    public static void main(String[] args) {
        int num;
        boolean divisible;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = scr.nextInt();


        switch(num%5<=0 && num%11<=0?1:2){
            case 1:
                System.out.println("Divisible");
                break;
            case 2:
                System.out.println("Not divisible");
        }
    }
    
}
