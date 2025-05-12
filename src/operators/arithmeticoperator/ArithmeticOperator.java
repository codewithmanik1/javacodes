package operators.arithmeticoperator;

//Assignment Operator
//Arithmetic Operator
public class ArithmeticOperator {

    //function : main() - from here java execute code
    public static void main(String[] args) {
        // + , - , *, / , %

        // + plus
        int varOne = 10;
        int varTwo = 20;

        int result = varOne + varTwo;
        System.out.println(result);

        //- minus
        result = varOne - varTwo;
        System.out.println(result);

        // * multiplication
        result = result * varTwo;
        System.out.println(result);

        // / division
        result = varOne / varTwo;
        System.out.println(result);

        // % modulus
        result = varOne % varTwo;
        System.out.println(result);

        int num = 232310;

        int tempOne = num / 10;
        int tempTwo = num % 10;

        System.out.println(tempOne);        //23231 - d, 23231 - n, v , p
        System.out.println(tempTwo);        //1 - d,    ,   0 - n , v , p

        //      23231             // (/) division
        // 10)  232310
        //    - 232310
        //--------------
        //           0

        //     12
        // 10) 121              num = 121 // num / 10 = 12
        //    -120                        // num % 10 = 1
        //--------------
        //       1

        //relational operator
        //pre-inc & post-inc
        //logical operators
    }
}
