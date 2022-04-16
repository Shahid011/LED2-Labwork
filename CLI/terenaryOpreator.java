package CLI;

import java.util.Scanner;

public class terenaryOpreator {
    public static void main(String[] args) {
        //initialize variables
        int age;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = src.nextInt();

        String result = (age >= 18) ? "You are eligible for voting." : "You are below 18.";
		System.out.println(result);
}
}