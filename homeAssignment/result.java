package homeAssignment;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        float physics, chemistry, biology, math, computer, total, percentage;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Physics mark: ");
        physics = scr.nextFloat();
        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter chemistry mark: ");
        chemistry = pcr.nextFloat();
        Scanner ncr = new Scanner(System.in);
        System.out.print("Enter biology mark: ");
        biology = ncr.nextFloat();
        Scanner ssr = new Scanner(System.in);
        System.out.print("Enter math mark: ");
        math = ssr.nextFloat();
        Scanner tcr = new Scanner(System.in);
        System.out.print("Enter computer mark: ");
        computer = tcr.nextFloat();

        total = physics+chemistry+biology+math+computer;

        percentage = total/500 *100;
        System.out.print(+percentage);

        if(percentage>=90){
            System.out.println("You passed with grade A");
        } else if (percentage>=80){
            System.out.println("You passed with grade B");

        }else if(percentage >= 70){
            System.out.println("You passed with grade C");
        } else if(percentage >= 60){
            System.out.println("You passed with grade D");
        } else if(percentage >=50){
            System.out.println("You paseed with grade E");

        } else {
            System.out.println("You secured grade F");
        }


    }
    
}
