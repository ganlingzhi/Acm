package huawei;

import java.util.Scanner;

public class TargetMinArray {
    public static void main(String[] args) {
        System.out.println(getMin(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(getMin(4, new int[]{1, 4, 4}));
        System.out.println(getMin(11, new int[]{1, 1, 1, 1, 1, 1}));
    }

    static int getMin(int target, int[] array) {
        int res = 0;
        int count;
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = array[i];
            if (sum == target) {
                res = 1;
                return res;
            }
            count = 1;
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                count++;
                if (sum == target) {
                    if (res == 0) {
                        res = count;
                    } else if (res > count) {
                        res = count;
                    }
                    break;
                } else if (sum > target) {
                    break;
                }
            }
        }
        return res;
    }
}
