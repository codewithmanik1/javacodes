package operators.unaryoperator;

public class UnaryOperator {

    public static void main(String[] args) {

        //sign
        // ++ : increment
        // -- : decrement


        int a = 10;
        //post increment
        System.out.println(a++);
        System.out.println(a);

        //post decrement
        System.out.println(a--);
        System.out.println(a);

        int b = 21;
        //pre increment
        System.out.println(++b);
        System.out.println(b);

        //pre decrement
        System.out.println(--b);    //21
        System.out.println(b);      //21


        a = 99;
        b = a - 21;

        // a = 99, b = 79
        int ans = a++ + b++ + --a + b++ + --b;  //99 + 78 + 99 + 79 + 79
        System.out.println(ans);                //n-434, p-434  , v-434
        System.out.println(a);
        System.out.println(b);


        //Homework
        ans = --b + ++b + a-- + b + a - a++ + b++ - --a + --b;
        System.out.println(ans);
        System.out.println(a);
        System.out.println(b);

        ans =  b + a + a-- -a + b-- + ++b + ans++;
        System.out.println(a);
        System.out.println(b);
    }
}
