public class evaluation {
    public static String eval(int marks) {
        if (marks <= 100 && marks >= 90) {
            return "A";
        }
        else if (marks <= 89 && marks >= 80) {
            return "B";
        }
        else if (marks <= 79 && marks >= 70) {
            return "C";
        }
        else if (marks <= 69 && marks >= 60) {
            return "D";
        }
        else {
            return "E";
        }
    }
}