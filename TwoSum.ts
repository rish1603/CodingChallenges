// https://leetcode.com/problems/two-sum/description/

function twoSum(nums: number[], target: number): number[] {

    let array: number[] = nums.slice().sort((a, b) => a - b); 

    let x : number = 0;
    let y : number = array.length - 1;

    //try to add smallest number to largest number first
    while(array[x] + array[y] != target) {
       (array[x] + array[y] > target) ? y-- : x++ 
    }

    // find the value from main array and handle edge case where both values are the same i.e. 3 + 3 = 6. We want 
    // to return a different index in this situation.
    const first : number = nums.indexOf(array[x]);
    const second : number = nums.findIndex((value, index) => value === array[y] && index != first );

    return [first, second];
};
