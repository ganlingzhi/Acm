package huawei;

import java.util.Scanner;

public class BottleToSoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while (scanner.hasNext()) {
            int n = scanner.nextInt();
             if (n == 0) {
                 break;
             }
            int bottle = 0;
            int res = 0;
            bottle = n;
            while (bottle >= 3) {
                int drink = bottle / 3;
                res += drink;
                bottle = drink + bottle % 3;
            }
            if (bottle == 2) {
                res++;
            }
            System.out.println(res);
        }
    }
}
