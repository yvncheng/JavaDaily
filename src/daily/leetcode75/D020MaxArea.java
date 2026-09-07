package daily.leetcode75;
// 11. Container With Most Water - Two Pointers
public class D020MaxArea {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            // 計算目前面積 
            // 容器的寬度 width = right - left
            // 容器高度由較矮的柱子決定 height[left] vs height[right]
            int area;
            if (height[left] < height[right]) {
                 area = (right - left) * height[left];
                 left++; // 移動較矮的那一側
            } else {
                area = (right - left) * height[right];
                right--; // 移動較矮的那一側
            }

            if (area > maxArea) { 
                maxArea = area; // 更新最大面積
            }

        }

        return maxArea;

    }

}
