package huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class CharacterSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> cList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cList.add(scanner.next());
        }
        cList.sort(new MyComparator());
        for (int i = 0; i < cList.size(); i++) {
            if (i != cList.size() - 1) {
                System.out.println(cList.get(i));
            } else {
                System.out.print(cList.get(i));
            }
        }
    }
    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            int lim = Math.min(len1, len2);
            char v1[] = s1.toCharArray();
            char v2[] = s2.toCharArray();

            int k = 0;
            while (k < lim) {
                char c1 = v1[k];
                char c2 = v2[k];
                if (c1 != c2) {
                    return c1 - c2;
                }
                k++;
            }
            return len1 - len2;
        }
    }
}
