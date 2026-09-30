package daily.topinterview150.arraystring;
/*
 * 55. Jump Game (Greedy)
 * 
 * 核心想法是不關心具體怎麼跳，而是維護目前能到達的最遠位置 farthest。
 * 遍歷陣列時，如果索引 i 已經超過 farthest，表示目前位置不可達，直接回傳 false。
 * 否則利用 i + nums[i] 更新最遠可達位置。
 * 如果最遠可達位置覆蓋到最後一格，代表一定存在一條路徑能到終點，因此回傳 true。
 */
public class Q0055CanJump {

    public boolean canJump(int[] nums) {
        
        // 目前能到達的最遠位置
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // 若目前位置都到不了，代表後面更不可能到
            if (i > farthest) {
                return false;
            }

            // 更新最遠可到達位置
            farthest = Math.max(farthest, i + nums[i]);

            // 已經可以覆蓋最後一格，直接成功
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;

    }

}
