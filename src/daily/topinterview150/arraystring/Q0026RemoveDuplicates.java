package daily.topinterview150.arraystring;
// 26. Remove Duplicates from Sorted Array
public class Q0026RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                 nums[k] = nums[i]; // 將保留元素搬到陣列前方
                k++; // 保留區長度加 1 
            }
        }
        return k;

    }

}
