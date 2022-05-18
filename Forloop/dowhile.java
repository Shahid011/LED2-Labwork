package Forloop;

import java.util.Scanner;

public class dowhile {
public static void main(String[] args) {
    int odd_count, even_count, num;

    Scanner src = new Scanner(System.in);
    System.out.print("Enter any number: ");
    num = src.nextInt();
    do{
        if (num%2==0){
            System.out.println(even_count);
        even_count++;

        }else{
            System.out.println(odd_count);
        odd_count++;

        }
        
        num++;
        
        while(num<18);
        if (even_count > odd_count){
            System.out.println("Even count is greater.");
        
    }else{
        System.out.print("Odd count is greater.");
    }

}
}

}


