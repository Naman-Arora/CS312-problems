package completed.february23;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse("hello there!");
    }

    public static void printReverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
