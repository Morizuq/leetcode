class Solution {
    fun maxArea(height: IntArray): Int {
        // Result variable
        var maxArea = 0
        // Left and right pointers
        var left = 0
        var right = height.size - 1

        while (left < right){
            val leftHeight = height[left]
            val rightHeight = height[right]
            
            val currentArea = (right - left) * minOf(leftHeight, rightHeight)
            maxArea = maxOf(maxArea, currentArea)

            if(rightHeight > leftHeight ){
                left++
            } else {
                right--
            }
        }
     return maxArea;
    }
}