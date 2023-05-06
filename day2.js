const lengthOfLongestSubstring = function(s) {
    const obj = {};
    let start = 0;
    let maxLength = 0;

    for(let i = 0; i < s.length; i++){
    /*
    Loop through string and check if the current character is a key in 'obj'

    And check if the value of the key is greater than the value of 'start'
    */
        if (s[i] in obj && obj[s[i]] >= start){
            /*
            If true, set the value of 'start' to the value of the key,
            current character
            */
            start = obj[s[i]]
        }

        obj[s[i]] = i + 1;
        //Set maximum length to equal the max between maxLength and "i minus the start + 1"
        maxLength = Math.max(maxLength, i - start + 1)
    }

    return maxLength;
};