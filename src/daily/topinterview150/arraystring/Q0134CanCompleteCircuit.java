package daily.topinterview150.arraystring;

/**
 * 134. Gas Station - Greedy
 * 
 * 當起點在某處失敗時，失敗區間內的所有站都可以一次排除，因此能從 O(N²) 優化到 O(N)。
 */
public class Q0134CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalTank = 0;     // 記錄全域油量盈虧
        int currentTank = 0;   // 記錄目前起點的油量盈虧
        int start = 0;         // 候選起點

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalTank += diff;
            currentTank += diff;

            // 若目前油量不足，表示 start ~ i 都不可能是答案
            if (currentTank < 0) {
                start = i + 1; // 下一站成為新的候選起點
                currentTank = 0; // 全域油量盈虧歸零
            }
        }
        return totalTank >= 0 ? start : -1; // 總油量不足一定無解
    }

}
