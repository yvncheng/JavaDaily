package daily.leetcode75;
// 1456. Maximum Number of Vowels in a Substring of Given Length - Sliding Window
public class D022MaxVowels {

    public int maxVowels(String s, int k) {
        
        int cnt = 0;
        for (int i = 0; i < k; i++) { // 計算第一個長度 k 視窗的母音數量
            if (isVowel(s.charAt(i))) {
                cnt++;
            }
        }

        int max = cnt;
                
        for (int right = k; right < s.length(); right++) { // 滑動視窗
            int left = right - k;
            
            if (isVowel(s.charAt(left))) { // 若離開視窗的是母音
                cnt--;
            }

            if (isVowel(s.charAt(right))) { // 若新加入視窗的是母音
                cnt++;
            }

            if (cnt > max) { // 取 cnt 和 ans 的最大值
                max = cnt;
            }

            if (max == k) { // 已達理論最大值 k，直接提前結束
                return k;
            }
        }
        return max;

    }

    private boolean isVowel(char c) {

        return c == 'a' ||
            c == 'e' ||
            c == 'i' ||
            c == 'o' ||
            c == 'u';
    
    }

}
