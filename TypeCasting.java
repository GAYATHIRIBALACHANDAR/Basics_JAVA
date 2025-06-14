public class TypeCasting {
    public static void main(String args[]){
        /*type casting means converting from one data type to another data type
          Two types:
          1.Implicit=smaller to larger type
          2.Explicit=larger to smaller type
          */
       
          //implicit data type
          int a=10;
          double b=a;
          System.out.println(b);
          
          int age=20;
          double ageb= age;
          System.out.println(ageb);
          
          //explicit data type
          double x=129.99;
          int y= (int)x;
          System.out.println(y);
    
}
