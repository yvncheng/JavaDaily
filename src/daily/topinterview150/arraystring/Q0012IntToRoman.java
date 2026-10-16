package daily.topinterview150.arraystring;

/**
 * 12. Integer to Roman (Greedy + Mapping Table)
 * 
 * 「由大到小貪心選擇」
 * 位數拆解 → 發現規律 → Greedy → 查表最佳化
 */
public class Q0012IntToRoman {

    public String intToRoman(int num) {
        
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        }; // 羅馬數字對應值（包含特殊情況）
        
        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        }; // 對應的羅馬數字

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < values.length; i++) { // 由大到小貪心選擇
            while (num >= values[i]) { // 同一個符號可能使用多次
                ans.append(symbols[i]);
                num -= values[i];
            }
        }
        return ans.toString();

    }

}
