package completed.february25;
public class WhileLoopMystery2 {
    public static void main(String[] args) {
        mystery(19);
        mystery(42);
        mystery(48);
        mystery(40);
        mystery(64);
    }

    public static void mystery(int x) {
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);
    }
}
