package huawei;

import java.util.Arrays;

public class DoWhileTest {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 6, 8,5,6,3,0};
        int i = 0;
        do {
            nums[i] -= 3;
        } while (nums[++i] < 4);
        System.out.println(Arrays.toString(nums));
    }
}
