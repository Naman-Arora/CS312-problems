package completed.february07;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(15);
    }

    public static void printNumbers(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("[" + i + "] ");
        }
    }
}
