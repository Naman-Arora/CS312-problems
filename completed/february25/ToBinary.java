package completed.february25;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(42));
    }

    public static String toBinary(int n) {
        String result = "";

        while (n / 2 > 0) {
            int remainder = n % 2;
            result = remainder + result;
            n = n / 2;
        }

        result = (n % 2) + result;

        return result;
    }
}
