package daily.topinterview150.arraystring;

/**
 * 13. Roman to Integer
 * 
 * 所有特殊情況都符合「左邊比右邊小」的規律。
 */
public class Q0013RomanToInt {

    public int romanToInt(String s) {

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int curr = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));
            if (curr < next) { // 若右邊更大，代表這個值要被扣掉
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        ans += getValue(s.charAt(s.length() - 1)); // 最後一個字元直接加進答案
        return ans;

    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

}
