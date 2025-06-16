public class LoopStatement {
    public static void main(String []args){
        /*It is used for executing the statement multiple time until the condition gets failed
         * 1.for loop     ==> entry-check loop
         * 2.while loop   ==> entry-check loop
         * 3.for each loop
         * 4.do-while     ==> exit-check loop
         * 5. nested loops ## apply for all loops
         * 6.infinte loops ## apply for all loops
         */
         
         //FOR LOOP ==> when we know the iterations we can use the for loop
         /* SYNTAX
          * for(initialization;condition;updation){       ==>structured 
              loop body;
            }


            intialization;     ==>without initialization and updation
            for(;condition;){
              loop body;
              *updation*
            }

            for(;;){        ==>infinte looop
               loop body;
            }
          */
          short sum=0;
          for (int i=1;i<=10;i++){
            sum+=i;
        }
          System.out.println(sum);
          int sum1=0; 
          int i=0;  //==> outside initialization
          for(;i<=100;){
            sum1+=i;
            i++;   //==> inside updation
          }
          System.out.println(sum1);
          //infinite looops
          for(;;){
           // System.out.println("hii");
          }
        
          //WHILE LOOP  ==>when we dont know the iteration process we can use the while loop
          /*
           * while(condition){
           *    loop body;
           *    updation;
           * }
           */
          // int w = 0;
          // while(w<=5){
          //   System.out.println(w);
          //   w++;
          // }
          

          //DO-WHILE STATEMENT  ==>EXIT CONTROL LOOP
          /*
           * do{
           *   //loop execute once even if the condition gets fail
           * }while(condition);
           */
          int number =10;
          do{
            System.out.println(i);
            i++;
          }while(i<5);
          //output   10    .....eventhough the condition gets failed but it is printed atleast once

         //FOR EACH LOOP....used to iterate arrays/collections easily
         /*
          * for(datatype temp_variable_name : arrayOrCollection){
          }
          */
          int[] marks={100,99,99,99,100};
          for(int temp_marks : marks){
            System.out.println(temp_marks);
          }
        /*output:
         * 100  
         * 99
         * 99
         * 99
         * 100
 
         */
        
    }
    
}
