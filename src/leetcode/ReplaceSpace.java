package leetcode;

public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
