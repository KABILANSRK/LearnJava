import java.util.*;
import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mul(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        if(b==0) {
            System.out.println("Divisor should not be 0. Enter a number:");
            return 0;
        }
        return a/b;
    }
}
