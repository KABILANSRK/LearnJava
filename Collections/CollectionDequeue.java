package Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionDequeue {
    public static void main(String[] args) {
        Deque<String> sobj = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("1.EnqueueFirst\n2.EnqueueLast\n3.DequeueFirst\n4.DequeueLast\n5.PeekFirst\n6.PeekLast\n7.Display\n8.Exit");
            System.out.println("Enter the option:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter the value: ");
                    String str1 = sc1.nextLine();
                    sobj.addFirst(str1);
                    break;
                
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter the value: ");
                    String str2 = sc2.nextLine();
                    sobj.addLast(str2);
                    break;

                case 3:
                    System.out.println("Enqueued value: " + sobj.removeFirst());
                    break;
                
                case 4:
                    System.out.println("Enqueued value: " + sobj.removeLast());
                    break;

                case 5:
                    System.out.println("Peek:" + sobj.peekFirst());
                    break;

                case 6:
                    System.out.println("Peek:" + sobj.peekLast());
                    break;

                case 7:
                    System.out.println(sobj);
                    break;

                case 8:
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