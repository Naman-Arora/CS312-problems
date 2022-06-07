package completed.february23;

public class Stutter {
    public static void main(String[] args) {
        System.out.println(stutter("Hello!"));
    }

    public static String stutter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = result + s.charAt(i) + s.charAt(i);
        }
        return result;
    }
}
