import java.util.*;
import java.util.Scanner;

public class arrayconc {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of marks to be entered:");
        int n = sc.nextInt();
        for (i=0;i<n;i++) {
            System.out.println("Enter the "+i+"th mark:");
            a[i] = sc.nextInt();
        }
        operations.mini(a,n);
        operations.maxi(a,n);
        operations.average(a,n);
    }
}