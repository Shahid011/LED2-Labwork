package homeAssignment;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int num;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter number of your choice: ");
        num = src.nextInt();
        if(num == 0){
            System.out.println("The given number is neither even nor odd. ");
        }
        else if(num%2 != 0){
            System.out.println("The given num is odd.");
        }if(num%2 == 0){
            System.out.println("The given number is even");
    }
}
}
