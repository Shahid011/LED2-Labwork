package Switch;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int sub1, sub2, sub3, sub4, sub5;
        float percentage;
        Scanner scr =new Scanner(System.in);
        System.out.print("Enter sub1 mark: ");
        sub1 = scr.nextInt();

        System.out.print("Enter sub2 mark: ");
        sub2 =scr.nextInt();
        System.out.print("Enter sub3 mark: ");
        sub3 = scr.nextInt();
        System.out.print("Enter sub4 mark: ");
        sub4 = scr.nextInt();
        System.out.print("Enter sub5 mark: ");
        sub5 = scr.nextInt();

        percentage = sub1+sub2+sub3+sub4+sub5/500*100;

        switch((percentage>=90?1:2)){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
        }
        switch(percentage>=70?1:2){
            case 1:
                System.out.println("Grade C");
                break;
            case 2:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Enter valid input!");
                break;
        }
        switch(percentage>=50?1:2){
            case 1:
                System.out.println("Grade E");
                break;
            case 2:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("Enter valid input!");
                break;
        }
        switch(percentage<40?1:2){
            case 1:
                System.out.println("Grade G");
                break;
            case 2:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter valid input!");
                break;
        }


    }
    
}
