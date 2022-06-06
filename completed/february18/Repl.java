package completed.february18;

public class Repl {
    public static void main(String[] args) {
        System.out.println(repl("hello", 3));

    }

    public static String repl(String s, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
}
