import java.util.Random;
public class Variables {
    public static void main(String[] args) {

        Random rand = new Random();

        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("Range for byte: " + byteMin + ".." + byteMax);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        short shortMin = -32768;
        short shortMax = 32767;
        System.out.println("Range for short: " + shortMin + ".." + shortMax);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        int intMin = -2147483648;
        int intMax = 2147483647;
        System.out.println("Range for short: " + intMin + ".." + intMax);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Range for long is wide..");
        long longRand = rand.nextLong();
        System.out.println( "Random long value: " + longRand);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Range for float is wide..");
        float floatRand = rand.nextFloat();
        System.out.println( "Random float value (0..1): " + floatRand);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Double..");
        double doubleRand = rand.nextDouble();
        System.out.println( "Random double value (0..1): " + doubleRand);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Char..");
        System.out.println("oops.. no function for random char in this library.");
        char charValue = 'N';
        int intCharValue = charValue;
        System.out.println( "Let it be: " + charValue);
        System.out.println( "ASCII value of it: " + intCharValue);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Finally boolean..");
        boolean boolRand = rand.nextBoolean();
        System.out.println( "Random boolean value: " + boolRand);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("Math functions: a = 5, b = 37");
        int a = 5, b = 37;
        System.out.println("a + b =" + " " + (a + b));
        System.out.println("a - b =" + " " + (a - b));
        System.out.println("a * b =" + " " + (a * b));
        System.out.println("a / b =" + " " + (a / b));
        System.out.println("mod a / b =" + " " + (a % b)+ " !!!");
        System.out.println("mod b / a =" + " " + (b % a));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Increment / Decrement");
        System.out.println(" a = " + " " + a );
        a+=3;
        System.out.println("a += 3, a = " + " " + a );
        a-=3;
        System.out.println("a -= 3, a = " + " " + a );
        a*=3;
        System.out.println("a *= 3, a = " + " " + a );
        a/=3;
        System.out.println("a /= 3, a = " + " " + a );
        a++;
        System.out.println("a++, a = " + " " + a );
        a--;
        System.out.println("a--, a = " + " " + a );
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");

        char char1 = 'A';
        char char2 = 'B';

        System.out.println( char1);
        System.out.println( char2);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");




    }
}
