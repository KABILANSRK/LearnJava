package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> sobj = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit");
            System.out.println("Enter the option:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the value: ");
                    String str = sc.nextLine();
                    sobj.offer(str);
                    break;
                
                case 2:
                    System.out.println("Enqueued value: " + sobj.remove());
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