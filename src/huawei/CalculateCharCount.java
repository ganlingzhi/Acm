package huawei;

import java.util.HashSet;
import java.util.Scanner;

public class CalculateCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if ((int) c <= 127) {
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
