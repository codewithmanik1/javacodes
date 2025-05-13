package operators.ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {

        //ternary operator
        //condition ? true : false
        //condition ? "true executes" : "false executes"

        int nMarks = 72;                            //nMarks - 72
        int dMarks = 94;                            //dMarks - 94

        //ternary operator
        // "" - In double quotes string is store

        //condition ? "if condition is true then this block" : "if condition false then this block"

        String ans = (nMarks > dMarks) ? "Niraj has a lower score" : "Deepali has a higher score than Niraj";
        //ans -
        //(nMarks > dMarks) ? "Niraj have less score" : "Deepali have high score than neeraj";
        // 72 > 94 ?  "Niraj have less score" : "Deepali have high score than neeraj";
        System.out.println(ans);

        int myAns = (nMarks <= dMarks) ? 100 : 101;
        System.out.println(myAns);
    }
}
