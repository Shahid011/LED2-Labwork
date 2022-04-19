
package CLI;
import java.util.Scanner;
public class votingEligibility {
    public static void main(String[] args) {
        //Initialize variables
        int age;
        boolean votercard = true;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scr.nextInt();
        if (age >= 18 && votercard==false){
            System.out.println("Your are eligible for voting");
        } else if (age >= 18 && votercard==false){
            System.out.println("Please make your votercard!");
        } else  if (age<18) {
            System.out.println("You're not eligible for voting");
        }

    }
}
