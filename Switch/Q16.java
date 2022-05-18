import java.util.Scanner;


public class Q16 {
    public static void main(String[] args) {
        int cp,sp;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of cp: ");
         cp = input.nextInt();
         
        System.out.print("Enter value of sp: ");
         sp = input.nextInt();
        
        switch(sp>cp?1:2){
            case 1:
                System.out.println("Profit");
                break;
            case 2:
                System.out.println("Loss");
        }


        
        }
    }


        
     
      
            
        
      
        

        

        




    

