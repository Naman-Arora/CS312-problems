package completed.february2;

public class PrintDesign {
    public static void main(String[] args) {
        printDesign();
    }

    public static void printDesign() {
        for (int i = 1; i < 10; i+=2) {
            for (int k = 0; k < (5 - (i / 2)); k++) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            for (int k = 0; k < (5 - (i / 2)); k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
