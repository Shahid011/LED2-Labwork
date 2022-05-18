package week4.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class myapp {
    public static void main(String[] args) {
        // int[] myarry = new int[5]; //Making myarry object and initializing
        // myarry[0]=1;   // Inserting values in array
        // myarry[1]=2;
        // myarry[2]=3;
        // myarry[3]=4;
        // myarry[4]=5;
        // System.out.print(Arrays.toString(myarry));
        // int []newArray = new int[]{1,2,3,4,5}; //Feeding arrays with arrays literals.
        // System.out.print(Arrays.toString(newArray));
        // System.out.print(newArray.length);
        // String []myArray = new String[5];
        // myArray[0] = "Shahid";
        // myArray[1] = "Sonal";
        // myArray[2] = "Kritika";
        // myArray[3] = "Prasna";
        // myArray[4] = "Anuj";
        // System.out.print(Arrays.toString(myArray));
    //     int[] myarry = new int[5]; //Making myarry object and initializing
    //     Scanner scr = new Scanner(System.in);
    //     for(int i=0; i<myarry.length;i++){
    //         int value = scr.nextInt();
    //         myarry[i]=value;

    //     }
    //     System.out.print(Arrays.toString(myarry));
    // String [] Arr= new String[5];
    // Scanner scr = new Scanner(System.in);
    // for(int i=0; i<Arr.length;i++){
    //     System.out.print("Enter Names: ");
    //     String value = scr.next();
    //     Arr[i]=value;
    // }
    // System.out.print(Arrays.toString(Arr));
    // for(int i=0; i<=Arr.length; i++){
    //     System.out.print("Element at"+i+"index"+Arr[i]);
    // }

    // int [] Sum = new int[5];
    // int sum = 0;
    // int value;
    // Scanner scr = new Scanner(System.in);
    // for(int i =0; i<=5; i++){
    //     System.out.print("Enter Numbers: ");
    //     value = scr.nextInt();
        
        
    // }
    // sum+=value;
    int[] myarr = new int[10];
    Scanner scr = new Scanner(System.in);
    
    for(int i=0; i<10; i++){
        System.out.print("Enter number: ");
        int value = scr.nextInt();

        

    }
    System.out.print(Arrays.toString(myarr));
    int countPrime=0;
    for(int i=0; i<myarr.length; i++){
        int value = myarr[i];
        int count =0;
        for(int j = 1; j<=value; j++){
            if(value%j == 0){
                count++;
            }
        }
        if(count==2){
            countPrime++;
        }

        
    }
    System.out.print(countPrime);
    
    

    }

}
