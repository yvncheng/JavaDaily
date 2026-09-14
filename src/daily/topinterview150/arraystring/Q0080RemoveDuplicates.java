package daily.topinterview150.arraystring;
// 80. Remove Duplicates from Sorted Array II
public class Q0080RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        
        if (nums.length <= 2) { // 長度小於等於 2 時一定符合
            return nums.length;
        }
        
        int write = 2; // 前兩個元素一定可以保留

        // 從第 3 個元素開始檢查
        for (int read = 2; read < nums.length; read++) {

            // 若目前數字與結果區間倒數第 2 個不同，表示加入後不會超過兩次
            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

}
