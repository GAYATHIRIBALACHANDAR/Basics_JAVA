import java.util.Scanner;
public class ArrayLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the count of numbers in the array:");
        int count = sc.nextInt();
        //int[5] number={1,2,3,4,5};
        int a[] = new int[count];
        System.out.println("Enter the elements");
        for(int i=0;i<count;i++){
             a[i]=sc.nextInt();
        }
        System.out.println("you entered");
        for(int i=0;i<count;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
    
}
