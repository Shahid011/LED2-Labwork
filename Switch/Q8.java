package Switch;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        //10. JAVA Program to take the value from the user as an input week number and print weekday by
        //using the switch statemen
        int num;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enteer any number from 0 - 7: ");
        num = scr.nextInt();

        switch(num){
            case 1:
                System.out.println("1--Sunday");
                break;
            case 2:
                System.out.println("2--Monday");
                break;
            case 3:
                System.out.println("3--Tuesday");
                break;
            case 4:
                System.out.print("4--Wednesday");
                break;
            case 5:
                System.out.println("5--Thrusday");
                break;
            case 6:
                System.out.println("6--Friday");
                break;
            case 7:
                System.out.println("7--Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
