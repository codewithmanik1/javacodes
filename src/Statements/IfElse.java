package Statements;

public class IfElse {
    public static void main(String[] args) {


        /**
         * if(true/false - conditions){
         *     //if condition is true this block will execute
         * }else{
         *     //if condition is false this block will execute
         * }
         *
         * */
        int a = 10;
        if(a >= 12){
            System.out.println("In if");
        }else{
            System.out.println("In else");
        }

        if(a >= 10)
        {
            System.out.println("In if");
        }

        //this type of block always executes - this block called as instnace block
        {
            System.out.println("In else");
        }
    }
}
