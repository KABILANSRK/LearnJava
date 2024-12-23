import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string:");
        s = sc.nextLine();
        operations.vc(s);
        System.out.println("Reverse:" + operations.rev(s));
        System.out.println("UpperCase" + operations.upper(s));
        System.out.println("Palindrome:" + operations.pal(s));
    }    
}
