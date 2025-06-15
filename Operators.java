public class Operators {
    public static void main(String []args){
    /*the operators were used to perform some operations
     * 1.Arithmetic operators
     * 2.Unory operators
     * 3.Assignment operators
     * 4.Boolean Operators
     * 5.Logical Operators
     * 6.Bitwise Operators
     * 7.Ternary Operators
     */
    //ARITHMETIC OPERATORS
    short a=10;
    short b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
          
    //UNORY OPERATORS (PRE, POST) (INCREMENT, DECREMENT)  
      int no=5;
      System.out.println(no++);//initially print and then increment
      System.out.println(no);
    /*output
    5
    6
     */   

    //ASSIGNMENT OPERATORS  (=)
    int as=5;
    as+=5;//a=a+5;  =>5+5 =>10
    System.out.println(as);
    as-=5;
    System.out.println(as);
     as*=5;
    System.out.println(as);
     as/=5;
    System.out.println(as);
     as%=5;
    System.out.println(as);
    
    //Boolean Operators (true or false)
    //Logical Operators (&&,||, !)
    boolean bike=true;
    boolean money=false;
    
    boolean tour=bike&&money;//both should be true
    System.out.println(tour);
    boolean tour1=bike||money;//anyone should be true
    System.out.println(tour1);
    System.out.println(!bike);//opposite for the given values


      

    }    
}
