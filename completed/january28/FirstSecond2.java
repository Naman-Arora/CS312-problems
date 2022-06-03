package completed.january28;

public class FirstSecond2 {

    public static void main(String[] args) {
        original();
        shortened();
    }
    
    public static void original() {
        
        int first = 8;
        int second = 19;

        first = first + second;
        second = first - second;
        first = first - second;

    }

    public static void shortened(){

        int first = 8, second = 19;
        first += second;
        second = first - second;
        first -= second;

    }

}
