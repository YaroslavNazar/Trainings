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
        */
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
        }

    }
}
