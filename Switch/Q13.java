import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter angle1 of triangle: ");
        a = scr.nextFloat();

        Scanner pcr = new Scanner(System.in);
        System.out.print("Enter angle2 of triangle: ");
        b = pcr.nextFloat();

        Scanner tcr = new Scanner(System.in);
        System.out.print("Enter angle3 of triangle: ");
        c = tcr.nextFloat();
        

        switch((a+b+b == 180 && a!=0 && b!=0 && c!=0?1:2)){
            case 1:
                System.out.println("This is valid triangle.");
                break;
            case 2:
                System.out.println("This is invalid triangle.");
            

        }
        

        
        }
    }
    

