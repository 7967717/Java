package core._6OOP;

/**
 * Created by roman.rudenko on 01-Oct-15.
 */
public class Overloading0 {

    static void print(char b){
        System.out.println("char");
    }

    static void print(byte b){
        System.out.println("byte");
    }

    static void print(short b){
        System.out.println("short");
    }

//    static void print(int b){
//        System.out.println("int");
//    }

//    static void print(long b){
//        System.out.println("long");
//    }

//    static void print(float b){
//        System.out.println("float");
//    }

//    static void print(double b){
//        System.out.println("double");
//    }

    static void print(Object b){
        System.out.println("object");
    }

    public static void main(String[] args) {
        char c = 0;
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5;
        double d = 6;
        Integer o = 7;

        print(0);
        print(0);
        print(0);
        print(0);
        print(0);
        print(0);
        print(0);
        print(0);
    }
}
