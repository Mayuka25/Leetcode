class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]ans=new int[nums.length];
        for(int a=0;a<nums.length;a++){
            int count=0;
            for(int b=0;b<nums.length;b++){
                if(nums[b]<nums[a]){
                    count++;
                }
            }
            ans[a]=count;
        }
        return ans;
        
    }
}