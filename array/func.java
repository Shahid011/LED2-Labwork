package week4.array;

import java.util.Scanner;

import javax.sound.midi.Track;

public class func {
    public static void main(String[] args) {
       System.out.print( myfunc());;
    }
    public static boolean myfunc(){
        int [] myArr = new int[]{1899,2013,2014,1947};
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int val = scr.nextInt();

        for(int i=0; i<=myArr.length;i++){
            if(val==myArr[i]){
                return true;
            }
        }
        return false;
        
        


    }
    
}
