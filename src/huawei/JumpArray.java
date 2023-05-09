package huawei;

public class JumpArray {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 0, 4};
        Boolean test = canJump(array);
        System.out.println(test);
        System.out.println(dfs(0, array[0], array));
    }

    static Boolean dfs(int currentIndex, int jump, int[] array) {
        for (int i = currentIndex + 1; i <= currentIndex + jump; i++) {
            System.out.println("i=" + i + "array[i]=" + array[i]);
            if (i + array[i] >= array.length - 1) {
                return true;
            } else {
                if (dfs(i, array[i], array)) {
                    return true;
                }
            }
        }
        return false;
    }

    static Boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxPos) {
                return false;
            } else {
                maxPos = Math.max(maxPos, i + nums[i]);
                if (maxPos > nums.length - 1) {
                    return true;
                }
            }
        }
        return true;
    }
}
