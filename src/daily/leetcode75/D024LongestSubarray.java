package daily.leetcode75;
// 1493. Longest Subarray of 1's After Deleting One Element - Sliding Window
public class D024LongestSubarray {

    public int longestSubarray(int[] nums) {
        
        int left = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) { // 新進來的數字是 0
                zeroCount++;
            }

            while (zeroCount > 1) { // 如果 0 太多，就一直縮小視窗
                if (nums[left] == 0) { // 如果離開的是 0，要扣回來
                    zeroCount--;
                }
                left++;
            }

            if ((right - left) > ans) {
                ans = right - left;
            }

        }
        return ans;

    }

}
