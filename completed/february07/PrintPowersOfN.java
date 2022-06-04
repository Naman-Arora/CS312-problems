package completed.february07;
public class PrintPowersOfN {
    public static void main(String[] args) {
        printPowersOfN(4,3);
        printPowersOfN(5,6);
        printPowersOfN(-2,8);
    }

    public static void printPowersOfN(int base, int exp) {
        String result = "";
        for (int i = 0; i <= exp; i++) {
            result = result + " " + (int) Math.pow(base, i);
        }
        System.out.println(result);
    }
}
