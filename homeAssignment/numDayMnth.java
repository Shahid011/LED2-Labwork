package homeAssignment;

import java.util.Scanner;

public class numDayMnth {
    public static void main(String[] args) {
        int month, year;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter months from 1-12: ");
      

        month = scr.nextInt();
        Scanner pcr = new Scanner(System.in);
        year = pcr.nextInt();
        
        System.out.print("Enter current year: ");

        if(month == 1 ){
            System.out.print("January");
            System.out.print("31 Days");
        }else if(month == 2){
            System.out.println("February");
            System.out.println("28/29 days");
            if((year%400 == 0) || ((year % 4 ==0) && (year % 100 != 0))) {
             System.out.print("29 days");
            }else{
                System.out.print("28 days");
            }

        }else if(month==3){
            System.out.println("March");
            System.out.println("31 days");
            
        }else if(month==4){
            System.out.println("April");
            System.out.println("30 days");
            
        }else if(month==5){
            System.out.println("May");
            System.out.println("31 days");
            
        }else if(month==6){
            System.out.println("june");
            System.out.println("30 days");
            
        }else if(month==7){
            System.out.println("july");
            System.out.println("31 days");
            
        }else if(month==8){
            System.out.println("agust");
            System.out.println("31 days");
            
        }else if(month==9){
            System.out.println("sepetmber");
            System.out.println("30 days");
            
        }else if(month==10){
            System.out.println("october");
            System.out.println("31 days");
            
        }else if(month==11){
            System.out.println("november");
            System.out.println("30 days");
            
        }else if(month==12){
            System.out.println("december");
            System.out.println("31 days");
            
        }else{
            System.out.println("Invalid input!! Please enter between 1-12.");
        }
    }
    
}
