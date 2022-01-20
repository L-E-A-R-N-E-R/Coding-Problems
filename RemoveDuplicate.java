class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0,j=0,k;
        //nums[j]=nums[i];
        for(i=j;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
            else
            {
                continue;
            }
        }
        k=j+1;
        return k;       
    }
}