/*An array is like container which is used to store the same data type values in the single variable */
import java.util.Scanner;
public class Arrays {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total numbers of array:");
        short size=sc.nextShort();


    //CREATION OF ARRAYS
    /*
    1. Declare + Allocate Size
    2. Declare + Initialize with values
    3. Declare first, then create
    */  
    
    //----1.Declare + Allocate Size--------
    int[] marks= new int[size];//in this initially setting the size of the array an then we get the elements from the user
    //gets value from the user
    System.out.println("Enter the values for the array:");
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    } 
    
    //display the values
    System.out.println("the gained student marks are: ");
    for(int mark : marks){
        System.out.print( " "+mark);
    }
    
   sc.close(); 
}
}
