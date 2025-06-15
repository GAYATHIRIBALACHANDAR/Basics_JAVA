import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String []args ){
        /*
         * there are three types of conditional statements are there:
         * 1.if
         * 2.if-else
         * 3.else
         * 4.Ternary
         
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        
        //if statement
        if(age>=18){
            System.out.println("Eligible to vote");
        }

        //if-else statement
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        //else-if statement
        if(age>=18 && age<=100){
            System.out.println("Eligible to vote");
        }
        else if(age<=0 || age>100){
            System.out.println("Print the correct values for age");
        }
        else{
            System.out.println("Not Eligible to vote");
        }

        //ternary operator
        String vote=(age>=18) ?"Eligible to vote":"Not eligible to vote";
        System.out.println(vote);
        sc.close();

    }
}
