package Statements;

public class IfElseLadder {

    public static void main(String[] args) {

        int a = 3;
        int b = 20;

        if(a <= 9){
            System.out.println("A is less than 9");

            if(a <= 8){
                System.out.println("A is less than 8");
            }else{
                System.out.println("A is not less than 8");
            }
        }else if (a <= 8){
            System.out.println("a is less than 8");
        }else if (a <= 5){
            System.out.println("A is less than 5");
        }else{
            System.out.println("A is greater than 9");
        }
    }
}
