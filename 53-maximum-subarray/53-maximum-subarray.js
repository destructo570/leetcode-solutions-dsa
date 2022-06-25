/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    return kaden(nums);
};

function kaden(nums){
    let currMax = -Infinity;
    let max = -Infinity;
    for(let num of nums){
        currMax = Math.max(num,num+currMax);
        max = Math.max(currMax, max);
    }
    return max;
}