class Solution {
    fun isPalindrome(x: Int): Boolean {
        var input = x;
        var reverse = 0;
        while(input > 0){
            val digit = input % 10;
            input /= 10
            reverse = reverse * 10 + digit
        }
        return reverse == x
    }
}
