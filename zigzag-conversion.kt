class Solution {
    fun convert(s: String, numRows: Int): String {
        if(numRows == 1 || s.length <= numRows){
            return s;
        }

       val rows = List(numRows) { StringBuilder() }
       var currentRow = 0; 
       var goingDown = false;

       for (c in s){
        rows[currentRow].append(c); 

        if(currentRow == 0 || currentRow == numRows -1){
          goingDown = !goingDown
        }

        currentRow += if(goingDown) 1 else -1
       }

      return rows.joinToString("")
    }
}
