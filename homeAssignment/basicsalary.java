package homeAssignment;

import java.util.Scanner;

public class basicsalary {
    public static void main(String[] args) {
        float salary, hra, da;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        salary = scr.nextFloat();
        
        

        if (salary<=10000){

            hra = 20 * salary/100;
            da = 80 * salary/100;
        }
    }
    
}
