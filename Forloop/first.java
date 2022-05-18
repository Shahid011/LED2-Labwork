package Forloop;

public class first {
    public static void main(String[] args) {
        int diff=0;
        int sum3=0; 
        int count3=0;
        int sum4 = 0;
        int count4 = 0;
        int i = 1;
        while(i<=20){
            if(i%4==0){
                count4++;
                sum4 = sum4+i;
            }
            if(i%3==0 && i<=15){
                count3++;
                sum3 =sum3 + i;
            }
            i++;
            System.out.println(sum3);
            System.out.println(sum4);
        }
        
       

        }
    }

   
    
