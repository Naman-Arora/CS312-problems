package completed.february23;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount(" this     string has     wide       spaces "));
        System.out.println(wordCount(" "));
    }

    public static int wordCount(String s) {
        int count = 0;
        char lastChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            } else {
                if (lastChar == ' ') {
                    count++;
                }
            }
            lastChar = s.charAt(i);
        }
        return count;
    }
}
