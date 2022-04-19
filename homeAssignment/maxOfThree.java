package homeAssignment;
import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        num1 = src.nextFloat();
        Scanner crs = new Scanner(System.in);
        System.out.print("Enter Num2: ");
        num2 = crs.nextFloat();
        Scanner rcs = new Scanner(System.in);
        System.out.print("Enter Num2: ");
        num3 = rcs.nextFloat();

        if (num1 > num2 && num1 > num3) {
            System.out.println(+num1);
        }else if(num2 > num1 && num2 > num3) {
            System.out.println(+num2);
        }else{
            System.out.println(+num3);
        }
        
    }
    
}
