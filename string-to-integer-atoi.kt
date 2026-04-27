class Solution {
    fun myAtoi(s: String): Int {
        val cleaned = s.trim()
        
        if(cleaned.isEmpty()) return 0

        var sign = 1
        var index = 0
        var res = 0
 
        if(cleaned[0] == '-'){
            sign = -1
            index = 1
        } else if(cleaned[0] == '+'){
            sign = 1
            index = 1
        }

        for(i in index until cleaned.length){
            val char = cleaned[i]
            if(!char.isDigit()) break;

            val digit = char.digitToInt();

            if(res > Int.MAX_VALUE / 10 || (res == Int.MAX_VALUE / 10 && digit > 7)){
                return if(sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }
            res = res * 10 + digit

        } 

        return res * sign
    }
}
