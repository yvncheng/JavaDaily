package daily.topinterview150.arraystring;
/*
 * 45. Jump Game II (Greedy)
 * 
 * 題目真正要想的是「我這一次跳躍的範圍有多大？」
 * 把 BFS 的每一層壓縮成一個區間來處理，因此不用 Queue，只要一直維護目前區間和下一個區間即可。
 */
public class Q0045Jump {

    public int jump(int[] nums) {

        int jumps = 0;       // 已跳躍次數
        int currentEnd = 0;  // 目前這一跳所能覆蓋的右邊界
        int farthest = 0;    // 下一跳可以延伸到的最遠位置

        // 到達最後一格就算成功，不用再處理
        for (int i = 0; i < nums.length - 1; i++) {
            // 更新目前看到的最遠位置
            farthest = Math.max(farthest, i + nums[i]);
            // 表示目前這層(BFS Layer)已經掃描完畢
            if (i == currentEnd) {
                jumps++; // 必須進入下一層，因此跳一次
                currentEnd = farthest; // 更新下一層邊界
            }
        }
        return jumps;

    }

}
