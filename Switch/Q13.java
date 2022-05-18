import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = src.nextDouble();
        System.out.print("Enter value of b: ");
        b = src.nextDouble();
        System.out.print("Enter value of c: ");
        c = src.nextDouble();      

        switch(a==b && b==c?1:2){
            case 1:
                System.out.println("Equilateral Triangle");
                break;
            case 2:
                System.out.println("Not an equilateral triang;e.");
                break;
        switch(){

        }

        }
    }
    
}
