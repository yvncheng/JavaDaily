package daily.topinterview150.arraystring;
// 27. Remove Element
public class Q0027RemoveElement {

    public int removeElement(int[] nums, int val) {
        
        int k = 0; // 慢指標：指向下一個可寫入的位置

        for (int i = 0; i < nums.length ; i++) { // 快指標：遍歷整個陣列
            if (nums[i] != val) { // 遇到不等於 val 的元素才保留
                nums[k] = nums[i]; // 將保留元素搬到陣列前方
                k++; // 保留區長度加 1
            }
        }
        return k;

    }

}
