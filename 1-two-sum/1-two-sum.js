/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const result = [];
    const map = {}
    
    for(let i=0; i<nums.length; i++){
        if(map[target-nums[i]] != undefined){
            result.push(i);
            result.push(map[target-nums[i]]);
            return result;
        }
        map[nums[i]] = i;
    }
    
};