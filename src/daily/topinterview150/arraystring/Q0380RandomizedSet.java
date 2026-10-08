package daily.topinterview150.arraystring;

import java.util.Arrays;

/**
 * 380. Insert Delete GetRandom O(1)
 * 
 * 要求：三個操作平均 O(1)。
 * 關鍵是把 HashMap(value → index) 和 ArrayList(index → value) 雙向搭配。
 * 刪除時利用 最後元素覆蓋待刪元素（swap-with-last），避免 ArrayList 搬移成本。
 */
public class Q0380RandomizedSet {

    private List<Integer> list; // 儲存所有元素，方便 O(1) 隨機存取
    private Map<Integer, Integer> map; // value -> index
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) { // 已存在不能重複插入
            return false;
        }

        list.add(val); // 加到尾端
        map.put(val, list.size() - 1); // 記錄其索引位置
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) { // 不存在
            return false;
        }
        
        int removeIndex = map.get(val); // 要刪除的位置
        int lastValue = list.get(list.size() - 1); // 最後一個元素

        list.set(removeIndex, lastValue); // 將最後元素搬到要刪除的位置
        map.put(lastValue, removeIndex); // 更新最後元素的新索引
        
        list.remove(list.size() - 1); // 刪除尾端元素
        map.remove(val); // 從 map 移除
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(list.size()); // 隨機取得索引
        return list.get(index);
    }

}
