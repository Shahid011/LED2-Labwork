package homeAssignment;

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        int day;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number from 1-6: ");
        day = scr.nextInt();

        if (day == 1){
            System.out.print(day + " is sunday");
        } else if(day==1){
            System.out.print(day + " is monday");
        }else if(day==2){
            System.out.print(day + " is tuesday");
        }else if(day==3){
            System.out.print(day + " is wednesday");
        }else if(day==4){
            System.out.print(day + " is thrusday");
        }else if(day==5){
            System.out.print(day + " is friday");
        }else if(day==6){
            System.out.print(day + " is saturday");
        }else {
            System.out.println("Enter number from 0-7");
        }
    }
}
