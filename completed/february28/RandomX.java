package completed.february28;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        int len = 0;
        while (len < 16) {
            len = (int) (Math.random() * 15) + 5;
            for (int i = 0; i < len; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
