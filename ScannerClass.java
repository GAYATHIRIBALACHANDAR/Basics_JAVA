import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//creating one object
        //integer
        System.out.println("Enter the integer:");
        int integer=sc.nextInt();

        //float
         System.out.println("Enter the float value:");
        float floatno=sc.nextFloat();
        //when you initialise you should provide with F float=3.14F

        //Long
        System.out.println("Enter the longest Integer:");
        long longno=sc.nextLong();

        //Short
        System.out.println("Enter the shortest value:");
        short shortno=sc.nextShort();

        //Byte
        System.out.println("Enter the value: ");
        byte byteno=sc.nextByte();

        //Boolean
        System.out.println("Enter the value: ");
        boolean Boolean=sc.nextBoolean();

        //String(1 word)
        System.out.println("Enter the only one string:");
        String word=sc.next();
        sc.nextLine();

        //String(1 line)
        System.out.println("Enter the line:");
        String line =sc.nextLine();

        System.out.println("the entered integer: "+integer+
                            "\n The entered float: " +floatno+
                            "\n The entered longno: "+longno+
                            "\n The entered shortno: "+shortno+
                            "\n The entered byteno: "+byteno+
                            "\n The entered boolean: "+Boolean+
                            "\n The entered word: "+word+
                            "\n The entered string line: "+line);
       sc.close();                     
     //Add a dummy sc.nextLine(); after nextInt(), next(), nextDouble(), etc.

   
        
    }
    
}
