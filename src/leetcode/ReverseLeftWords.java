package leetcode;

public class ReverseLeftWords {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("0123456", 2));
    }

    public static String reverseLeftWords(String s, int n) {
        String left = s.substring(0, n);
        String remain = s.substring(n);
        return remain + left;
    }
}
