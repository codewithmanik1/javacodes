package operators;

//Relational Operators
public class RelationalOperators {
    public static void main(String[] args) {
        // < , <=, >, >= , == , !=

        //always -: relational operators returns only true or false;

        // < - less than

        int a = 10;                             // a = 10
        int b = 20;                             // b = 20

        boolean result = a < b;                 // 10 < 20
        System.out.println("a < b = " + result);

        // <= - less than equals to
        b = a - 2 + 10;
        System.out.println(b <= a);     //false

        // > - greater than
        System.out.println(b > a);      //true

        //>= - greater than equals to
        System.out.println(b >= a);     //true

        // ==  - equal equals to
        a = a + 8 + b;
        result = a == b;
        System.out.println(result);

        // != - not equals to

        result = a != b;                //36 != 18 : 36 is not equals to 18
        System.out.println(result);

        a = a - b;
        System.out.println(a!=b);       //18 != 18 : 18 is not equals to 18

        //post inc , pre inc , post dec, pre dec
    }
}
