class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int rig=0,lef=0;
            int l=0,r=nums.length-1;
            while(l<i)
            {
                lef+=nums[l];
                l++;
            }
            while(i<r){
            rig+=nums[r];
            r--;
            }
            ans[i]=Math.abs(lef-rig);
        }
        return ans;
    }
}