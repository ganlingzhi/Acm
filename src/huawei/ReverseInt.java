package huawei;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        String n = new Scanner(System.in).nextLine();
        StringBuilder stringBuilder = new StringBuilder(n);
        System.out.println(stringBuilder.reverse());
    }
}
