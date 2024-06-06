package basics;

public class Primitives {

    public static void main(String[] args) {
        char var = 256; //size is 2 bytes i.e. 16 bits = 2^15
        System.out.println(var);

        byte by = 0; //1 byte = 8 bits i.e. 2^7 = 256 (0 to 255)
        //signed 2's compliment it is so partial is negative and partial is positive out of 256
        //so the range is -128 to 127
        // if the left most bit is 0 then it is positive
        // if its 1 it is negative
        //default value is 0; It is only assigned with class member variables.

        short sh = 0; //2 bytes
        // signed 2's complement
        // range is -32768 to 32767
        //default value is 0;

        int in = 0; //4 bytes 32 bits
        //signed 2;s complement
        //range is -2^31 to 2^31 -1
        //default value is 0;

        long ll = 0; // 8 bytes  = 64 bits
        // signed 2's complement
        //range is -2^63 to 2^63-1

        float f = 0.3f; // do not use float in your application
        // use big integer since it is IEE754 Representation
        double d = 0.33d; //same as above unless and until you are specific.

        boolean b = true; // 1  bit because it is either 0 or 1;

        //char, byte, short, int, long are Integral Type meaning you can assign -ve to +ve values
        //float and double are fractional part
        //boolean for true/false


        //Types of conversion
        // Widening/ automatic conversion ==  going from shorting to longer
        byte abc = 10;
        int bbc = abc; // there will be automatic conversion happening 1byte to 4 bytes
        System.out.println(bbc);

        //Down casting / explicit == not possible from shorter to longer but we have to do typecasting
        int bb = 128;
        //byte bac = bb; //this is not allowed
        byte bac = (byte)bb; // this is possible since manual typecasting was done.

        //issue with DownCasting
        //range of byte is -128 to 127
        System.out.println(bac); //kind of a loop it will rotate and print the negative values
        //so we need to be careful while we down cast variables.

        //Promotion
        byte a = 127;
        byte c = 1;
       // byte sum =  a+c; // during an expression when we cross the range
        // it would be doing internal promotion. so all converted to integer4

        byte sum =(byte) (a+c);
        System.out.println(sum);












    }

}
