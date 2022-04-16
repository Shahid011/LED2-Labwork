
package CLI;
import java.util.Scanner;
public class votingEligibility {
    public static void main(String[] args) {
        //Initialize variables
        int age;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scr.nextInt();
        if(age > 18) {
            System.out.println("You are eligible for voting!!");
        } else {
            System.out.println("You are not eligible for voting!");
        }

    }
}
