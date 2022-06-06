package completed.february18;

public class Season {
    public static void main(String[] args) {
        System.out.println(season(1, 21));
        System.out.println(season(2, 28));
        System.out.println(season(3, 15));
        System.out.println(season(3, 16));
        System.out.println(season(4, 1));
        System.out.println(season(6, 15));
        System.out.println(season(6, 16));
        System.out.println(season(8, 9));
        System.out.println(season(9, 15));
        System.out.println(season(9, 16));
        System.out.println(season(10, 31));
        System.out.println(season(12, 15));
        System.out.println(season(12, 16));
    }

    public static String season(int month, int day) {
        if (((month == 12) && (day >= 16)) || (month == 1) || (month == 2) || ((month == 3) && (day <= 15))) {
            return "Winter";
        } else if (((month == 6) && (day >= 16)) || (month == 7) || (month == 8) || ((month == 9) && (day <= 15))) {
            return "Summer";
        } else if (((month == 9) && (day >= 16)) || (month == 10) || (month == 11) || ((month == 12) && (day <= 15))) {
            return "Fall";
        } else {
            return "Spring";
        }
    }
}
