package homeAssignment;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        float sp, cp;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        sp = src.nextFloat();
        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        cp = pcr.nextFloat();

        if(sp > cp){
            System.out.println("loss");
        }else{
            System.out.println("loss");
        }
    }
    
}
