package Switch;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int year,leap_year;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter year");
        year = scr.nextInt();

        leap_year = year%400 == 0 || year%100 == 0 || year%4==0?1:0;

        switch(leap_year){
            case 1:
                System.out.println("\n" + year+ " is the leap");
                break;
            case 0:
                System.out.println("\n"+ year + " is not the leap year");
                break;
            default:
                System.out.println("\n" +year+" is not the leap year.");
        }
       

    }
}

       