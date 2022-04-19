package homeAssignment;

import java.util.Scanner;

public class vowelconst {
    public static void main(String[] args) {
        char alpha;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter any character: ");
        alpha = src.next().charAt(0);
        
        if((alpha =='a' || alpha =='e' || alpha == 'i' || alpha == 'o' || alpha =='u')){
            System.out.print(alpha +" is vowel.");
        } else {
            System.out.print(alpha +" is consonent.");
        }
    }
    
}
