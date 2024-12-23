import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        while (true) {
            System.out.println("Enter the mark:");
            marks = sc.nextInt();

            if(marks == -1) {
                System.out.println("Exiting program...");
                break;
            }

            if (marks >= 0 && marks <=100) {
                System.out.println("Mark:"+ evaluation.eval(marks));
            }
            
            else {
                System.out.println("Enter the marks between 1 to 100");
            }
        }
    }
}
