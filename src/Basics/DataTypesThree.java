package Basics;

public class DataTypesThree {
    public static void main(String[] args) {

        //Primitive data types

        //data type - byte
        //variable - b
        byte b = 127;       //1 byte - 8 bits       | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 |

        //-32,768 to 32,767
        short s = 32767;     //2 bytes - 16 bits      | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0

        //-2,147,483,648 to 2,147,483,647
        int i = 128; //4 byte - 32 bit       | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 |

        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 100;   //8 bytes - 64 bits | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0

        float f = 12.23f;   //4 bytes - 32 bits

        double d = 2344332.23232; //8bytes - 64 bits

        //true or false
        boolean bf = true;      //1 byte - 8 bits

        //stores character
        char c = 'a';       //2bytes - 16 bits

    }
}
