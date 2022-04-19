package homeAssignment;

import java.util.Scanner;

public class divby5 {
    public static void main(String[] args) {
        int num;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = src.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Given number is divisible by 11 and 5 both");
        }else{
            System.out.println("Given number is not divisible by 5 and 11");
        }
    }
    
}
