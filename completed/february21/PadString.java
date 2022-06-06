package completed.february21;

public class PadString {
    public static void main(String[] args) {
        System.out.println(padString("hello", 8));
        System.out.println(padString("congratulations", 10));
    }

    public static String padString(String s, int n) {
        String result = "";
        if (n < s.length() || n == s.length()) {
            return s;
        } else {
            for (int i = 0; i < n - s.length(); i++) {
                result += " ";
            }
            result += s;
        }
        return result;
    }
}
