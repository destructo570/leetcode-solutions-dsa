/**
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */
var wordBreak = function(s, wordDict) {
    const dp = [];
    return helper(s, wordDict, dp);
};

function helper(str, dict, dp){
    if(str==="") return true;
    if(dp[str.length]===1) return true;
    if(dp[str.length]===-1) return false;
    for(let word of dict){
        let idx = str.indexOf(word);
        str.substring(idx, word.length)
        if(idx === 0){
            let result = helper(str.substring(idx+word.length), dict, dp);
            dp[str.length] = result===true?1:-1;
            if(result) return true;
        }
    }
    dp[str.length] = -1;
    return false;
}