package operators.logicalOperator;

public class LogicalOperator {

    //code execute from here
    public static void main(String[] args) {
        // && : logical AND operator
        // || : logical OR operator

        // Logical operator also returns true or false value

        int nMarks = 72;
        int dMarks = 94;

        // && -
        //conditionOne  && conditionTwo
        //      T        &&      T           = T
        //      T        &&      F           = F
        //      F        &&      F           = F
        //      F        &&      T           = F

        boolean resultOne = nMarks > dMarks;
        System.out.println(resultOne);          //FALSE

        boolean resultTwo = nMarks < dMarks;
        System.out.println(resultTwo);          //TRUE

        // && : logical AND Operator

        boolean ans = (resultOne && resultTwo) && (nMarks < (nMarks - dMarks));
        //(false && true) && (72 < (-22))
        //(false) && (false)
        //false
        System.out.println(ans);

        // || - Logical OR Operator
        //conditionOne   || conditionTwo
        //      T        ||      T           = T
        //      T        ||      F           = T
        //      F        ||      F           = F
        //      F        ||      T           = T

        // || : Logical OR Operator

        ans = (resultOne || resultTwo);
        System.out.println(ans);            //True

        ans = (resultOne || resultTwo) || (nMarks < (nMarks - dMarks));
        //(false || true) || (72 < -22)
        //(true) || (false)
        //true
        System.out.println(ans);                                            //p-true, d-true, n-true

        // ! : NOT operator
        boolean temp = false;
        System.out.println(!temp);                  //!false

        System.out.println(!(202 != 12 && (121 <= 21 || 21 != 2111)));      //n-false , p-pooja, v-false, d-false
        //(!(202 != 12 && (121 <= 21 || 21 != 2111)))
        //(!(true && (false || true)))
        //(!(true && true))
        //(!(true))
        //false
    }

}
