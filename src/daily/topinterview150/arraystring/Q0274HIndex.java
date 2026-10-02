package daily.topinterview150.arraystring;

import java.util.Arrays;

/**
 * 274. H-Index
 * 
 * 排序後站在第 i 個位置，把 n-i 看成「目前有幾篇論文可以一起達標」，
 * 只要最小的那篇 citations[i] 都大於等於 n-i，
 * 就代表這 n-i 篇全部達標，因此答案就是 n-i。
 */
public class Q0274HIndex {

    public int hIndex(int[] citations) {
        
        Arrays.sort(citations); // 將陣列從小到大進行排序
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;  // 目前位置右側(含自己)共有 n - i 篇論文

            // 若這些論文的引用數都至少為 h
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0; // 沒有任何 h 滿足條件

    }

}
