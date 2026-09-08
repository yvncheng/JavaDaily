package daily.leetcode75;

import java.util.Arrays;

// 1679. Max Number of K-Sum Pairs - Two Pointers
public class D021MaxOperations {

    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums); // 先排序，方便使用雙指標

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == k) { // 找到一組合法 pair
                count++; 
                left++;
                right--;
            } else if (sum < k) { // 和太小，需要更大的數字
                left++;
            } else { // 和太大，需要更小的數字
                right--;
            }
        }
        return count;
    }

}
