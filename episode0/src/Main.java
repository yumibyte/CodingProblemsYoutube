public class Main {


    public static void main(String[] args) {
        System.out.println(MakeTwoConsecutive("ABAB"));

    }
    public static String MakeTwoConsecutive(String s) {
        // complexity is linear

        // have to remove at least one character
        // therefore must have at least 2 characters
        int c = 0;
        int n = s.length() - 1;

        // compare before removal
        for (int i = 0; i < n; i ++) {
            System.out.println(s.charAt(i));

            if (s.charAt(i) == s.charAt(i + 1)) {
                c ++;
            }
        }

        // compare after removal

        for (int i = 0; i < n - 1; i ++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                c ++;
            }
        }

        return (c > 0 && s.length() > 2 ? "Possible" : "Impossible");
    }

    public static
}
