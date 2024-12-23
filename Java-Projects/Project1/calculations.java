import java.util.*;
import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the option you want to perform:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit\n");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter a number a=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int a = sc.nextInt();
                    System.out.println("Enter a number b=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int b = sc.nextInt();
                    System.out.println("Sum:"+ Calculator.add(a,b));
                    break;
                
                case 2:
                    System.out.println("Enter a number a=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int c = sc.nextInt();
                    System.out.println("Enter a number b=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int d = sc.nextInt();
                    System.out.println("Difference:"+ Calculator.sub(c,d));
                    break;
                
                case 3:
                    System.out.println("Enter a number a=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int e = sc.nextInt();
                    System.out.println("Enter a number b=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int f = sc.nextInt();
                    System.out.println("Multiply:"+ Calculator.mul(e,f));
                    break;

                case 4:
                    System.out.println("Enter a number a=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int g = sc.nextInt();
                    System.out.println("Enter a number b=");
                    while(!sc.hasNextInt()) {
                        System.out.println("Enter valid input:");
                        sc.next();
                    }
                    int h = sc.nextInt();
                    while(h==0) {
                        System.out.println("Divisor cannot be Zero:");
                        h=sc.nextInt();
                    }
                    System.out.println("Division:"+ Calculator.div(g,h));

                case 5:
                    System.out.println("Program exits...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct option:");
            }
        }
    }
}