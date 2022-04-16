package CLI;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        //Initialize variables p,t,r;
        float p, t, r, si;
        //Use Scanner class for getting user input
        Scanner principle = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        p = principle.nextFloat();
        Scanner time = new Scanner(System.in);
        System.out.print("Enter time period: ");
        t = time.nextFloat();
        Scanner rate = new Scanner(System.in);
        System.out.print("Enter rate of interest: ");
        r = rate.nextFloat();

        //write algoritm for SI
        si = (p*t*r)/100;

        System.out.println(+si);
    }
}
