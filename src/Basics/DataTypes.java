package Basics;

public class DataTypes {

    public static void main(String[] args) {

        // 1 byte = 8 bit
        // | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |

        byte b = 127;
        System.out.println(b);

        short s = 12;
        System.out.println(s);      // 2 bytes = 8 * 2 = 16 bits

        int i = 1001;
        System.out.println(i);      // 4 bytes = 32 bits

        long l = 1212121;
        System.out.println(l);      // 8 bytes = 64 bits

        float f = 12.34f;
        System.out.println(f);      // 4 bytes = 32 bits

        double d = 32.23232;
        System.out.println(d);      // 8 bytes = 64 bits

        boolean bf = true;
        System.out.println(bf);     //1 byte = 8 bits

        char c = 122;
        System.out.println(c);     //2 byte = 16 bits
        //because of Java supports ascii values

    }
}
