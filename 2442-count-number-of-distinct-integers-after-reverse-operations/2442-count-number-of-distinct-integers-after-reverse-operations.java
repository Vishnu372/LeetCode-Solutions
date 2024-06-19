class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        int v=n;
        for(int i=0;i<n;i++)
        {
            arr[v]=rev(nums[i]);
            v++;
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<n*2;i++)
        {
            res.add(arr[i]);
        }
        return res.size();
    }
    private int rev(int val)
    {
        int ans=0;
        while(val>0)
        {
            int rem=val%10;
            ans=(ans*10)+rem;
            val=val/10;
        }
        return ans;
    }
}