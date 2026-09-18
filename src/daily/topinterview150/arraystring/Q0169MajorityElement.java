package daily.topinterview150.arraystring;
/*
 * 169. Majority Element
 * 多數投票演算法 (Boyer–Moore majority vote algorithm)
 * 將不同元素視為互相抵消，只維護一個候選人與票數。
 * 遍歷陣列時，相同元素增加票數，不同元素減少票數；當票數歸零時，更換候選人。
 * majority element 出現次數大於其他所有元素總和，最後一定會留下來。
*/
public class Q0169MajorityElement {

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int n : nums) {
            if (count == 0) { // 當前候選人的票數耗盡，改推新的候選人
                candidate = n;
            }

            if ( n == candidate ) {
                count++;
            } else {
                count--; // 等同於把不同元素兩兩抵消
            }
        }
        return candidate; // majority element 次數 > n / 2，因此最後一定會存活下來

    }

}
