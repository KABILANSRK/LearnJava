public class operations {
    public static void vc(String s) {
        int i;
        for(i=0;i<s.length();i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch)) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(s.charAt(i) + "Vowel");
                }
                else {
                    System.out.println(s.charAt(i) + "Consonant");
                }
            }
        }
    }

    public static String rev(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    public static String upper(String s) {
        return s.toUpperCase();
    }

    public static String pal(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z]" , "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if(cleaned.equals(reversed)) {
            return "Palindrome";
        }
        else {
            return "Not a Palindrome";
        }
    }

    public static void mini(int[] a, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mini'");
    }

    public static void maxi(int[] a, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maxi'");
    }

    public static void average(int[] a, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'average'");
    }
}
