package completed.february21;

public class Vertical {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
