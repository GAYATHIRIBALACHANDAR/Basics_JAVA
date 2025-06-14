import java.util.Scanner;

public class practice {
   public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Name: ");
    String name=sc.nextLine();
        System.out.println("Enter the Address: ");
    String address=sc.nextLine();
        System.out.println("Enter the Age: ");
    int age=sc.nextInt();
     
    System.out.println("Your name is " +name+ " Your Address is" +address+" Your age is ");
    sc.close();


   }   
}
