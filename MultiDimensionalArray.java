import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  no of rows: ");
        short rows= sc.nextShort();
        System.out.println("Enter the no of columns: ");
        short columns=sc.nextShort();
        short [][] matrix=new short[rows][columns];


        //Getting the input from the user for the matrix:
        System.out.println("Enter the matrix elements: ");
        for(short i=0;i<rows;i++){
            for(short j=0;j<columns;j++){
                System.out.println("For the matrix: ["+i+"] , ["+j+"] :");
                matrix[i][j]=sc.nextShort();
            }
        }

        //Displalying the elements
        System.out.println("The entered matrix are: ");
        for(short i=0;i<rows;i++){
            for(short j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     sc.close();   

    }
    
}
