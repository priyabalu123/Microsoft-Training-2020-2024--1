class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}

/*Input: nums = [1,1,2]
Output: 2, nums = [1,2,_] */
