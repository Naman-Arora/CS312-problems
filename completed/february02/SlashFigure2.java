package completed.february02;

public class SlashFigure2 {

    public static final int size = 7;

    public static void main(String[] args) {
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < (a * 2); b++) {
                System.out.print("\\");
            }
            for (int c = (4 * a); c < ( (size * 4) - 2); c++) {
                System.out.print("!");
            }
            for (int d = 0; d < (a * 2); d++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}

// !!!!!!!!!!!!!!
// !!!!!!!!!!!!!!!!!!!!!!