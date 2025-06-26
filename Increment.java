 
 import java.util.Scanner;
 public class Increment{
    public static void main(String[]args){
        System.out.println("Enterr the ending value:");
        Scanner sc= new Scanner(System.in);
        int end=sc.nextInt();
        //----------using post increment--------------
        for(int i=0;i<=end;i++){
            System.out.print("" +i);
            
        }
        System.out.println("");
        //-----------------using pre increment-----------
        for(int i=0;i<=end;++i){
            System.out.print(i);
        }
        sc.close();

    }
 }
