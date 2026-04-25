class Solution {
    fun reverse(x: Int): Int {
        var res = 0;
        var input = x;

         while (input != 0){
            val lastInt = input % 10;

            // 1. CHECK FOR OVERFLOW: If I multiply by 10, will I go over?
            if (res > Int.MAX_VALUE / 10 
                || (res == Int.MAX_VALUE / 10 && lastInt > 7)) {
                return 0 
            }
    
            // 2. CHECK FOR UNDERFLOW: If I multiply by 10, will I go under?
            if (res < Int.MIN_VALUE / 10 
                || (res == Int.MIN_VALUE / 10 && lastInt < -8)) {
                return 0
            }
    
            input /= 10;
            res = res * 10 + lastInt;
         }
        return res;
    }
}
