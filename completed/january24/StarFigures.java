package completed.january24;

public class StarFigures {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            set();
            if (i == 0) {
                System.out.println("");
            }
        }

        line();
        line();
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            single();
        }
        set();
    }

    public static void line() {
        System.out.println("*****");
    }

    public static void two() {
        System.out.println(" * *");
    }

    public static void single() {
        System.out.println("  *");
    }

    public static void set() {
        line();
        line();
        two();
        single();
        two();
    }
}