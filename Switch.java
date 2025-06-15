import java.util.Scanner;

public class Switch {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character to check whether it is vowels or consonant:");
        char ch=sc.next().charAt(0);
        //System.out.println(ch);

        switch (ch){
            case 'a':
            System.out.println("vowels");
            break;

            case 'e':
            System.out.println("vowels");
            break;

            case 'i':
            System.out.println("vowels");
            break;

            case 'o':
            System.out.println("vowels");
            break;

            case 'u':
            System.out.println("vowels");
            break;

            default:
            System.out.println("consonent");
        }
        sc.close();
}
    
}
