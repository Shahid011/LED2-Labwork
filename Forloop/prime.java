package Forloop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
      int number;
      for(number=1; number<=30; number++){
          int count = 30;
          for(int i = 1; i <= number; i++){
              if(number%i == 0){
                  count += 1;
              }
          }
          if(count==2){
              System.out.println(count);
          }
        }

    }
    
}
