import java.sql.SQLOutput;

public class Lesson_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        /*
        if (a >= b) {
            System.out.println("Equal values");
        }
        else if (a==b){
            System.out.println("Not equal values");
        }
        else System.out.println("b > a");

        System.out.println("a == b :" + (a==b));
        System.out.println("a >= b :" + (a>=b));
        System.out.println("a != b :" + (a!=b));
        System.out.println("a > b :" + (a>b));
        System.out.println("a < b :" + (a<b));
        System.out.println("a > b || a < b :" + (a>b || a<b));

        char charVal = 'd';
        switch (charVal) {
        case 'a':
            System.out.println("a is here");
            break;
        case 'b':
            System.out.println("b is here");
            break;
        case 'c':
            System.out.println("c is here");
            break;
        default:
            System.out.println("something else");

        int num = 3;
        int output = 0;
        switch (num){
            case 1:
                output = 3;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;

            }
        System.out.println("Output: " +  output);

        int x = 3, y = 2;
        int z = x<y? (x+y) : (x-y);
        System.out.println("Z= " + z);

         */
   
        System.out.println("Z = " + doMultiplicate(2,2));

    }
    public static int doMultiplicate(int a, int b){
        int c = a*b;
        System.out.println("c = " + c);
        return c;
    }
}
