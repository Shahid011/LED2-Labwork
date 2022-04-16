package CLI;

import java.util.Scanner;

public class percentCalculation {
    public static void main(String[] args) {
        //initailize variables
        float oops, programing, Business, economics, percent, markObt;
        Scanner src = new Scanner(System.in);
        System.out.print("oops: ");
        oops = src.nextFloat();
        Scanner pro = new Scanner(System.in);
        System.out.print("Programming: ");
        programing = pro.nextFloat();
        Scanner bus = new Scanner(System.in);
        System.out.print("Business: ");
        Business = bus.nextFloat();
        Scanner ech = new Scanner(System.in);
        System.out.print("Economics: ");
        economics = ech.nextFloat();
        markObt = oops+programing+Business+economics;
        percent = markObt/400*100;

        if(percent >= 70){
            System.out.print("You passed with first class ");
        } else if(percent >= 59) {
            System.out.print("You passed with uperr second class ");
        } else if(percent >= 49) {
            System.out.print("You passed with second class "); 
        } else if(percent >= 39) {
            System.out.print("You passed with uperr second class ");
        } else {
            System.out.print("You passed with third second class ");
            System.out.print("Fail");
        }

        


    }
    
}
