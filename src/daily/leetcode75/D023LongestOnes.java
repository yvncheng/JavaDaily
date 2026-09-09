package daily.leetcode75;
// *** 1004. Max Consecutive Ones III - Sliding Window
public class D023LongestOnes {

    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) { // 新進來的數字是 0
                zeroCount++;
            }

            while (zeroCount > k) { // 如果 0 太多，就一直縮小視窗
                if (nums[left] == 0) { // 如果離開的是 0，要扣回來
                    zeroCount--;
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1); // 此時視窗一定合法

        }

        return ans;
    
    }

}
