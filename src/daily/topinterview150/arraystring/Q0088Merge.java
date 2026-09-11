package daily.topinterview150.arraystring;
// 88. Merge Sorted Array
public class Q0088Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m - 1; // 指向 nums1 有效元素最後一格
        int j = n - 1; // 指向 nums2 最後一格
        int k = m + n - 1; // 指向合併後應填入的位置

        while (i >= 0 && j >= 0) { // 從尾端開始比較較大的元素
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) { // 若 nums2 還有剩餘元素，繼續搬入 nums1
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }

}
