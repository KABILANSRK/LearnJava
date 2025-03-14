package Collections;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> sobj = new Stack<>();
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
            System.out.println("Enter the option:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    sobj.push(str);
                    break;
                
                case 2:
                    System.out.println("Popped: " + sobj.pop());
                    break;

                case 3:
                    System.out.println("Peek:" + sobj.peek());
                    break;

                case 4:
                    System.out.println(sobj);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                default:
                    System.out.println("Enter the correct option....");
                    break;
            }
        }
    }
}
