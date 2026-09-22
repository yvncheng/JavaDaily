package daily.topinterview150.arraystring;
// 189. Rotate Array
public class Q0189Rotate {
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // 避免 k 大於陣列長度
        k %= n;

        // 第一次：反轉整個陣列
        reverse(nums, 0, n - 1);

        // 第二次：反轉前 k 個元素
        reverse(nums, 0, k - 1);

        // 第三次：反轉剩下的元素
        reverse(nums, k, n - 1);
    }

    // 將區間 [left, right] 原地反轉
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            // 交換左右元素
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
