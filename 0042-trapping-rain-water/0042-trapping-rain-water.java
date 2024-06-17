class Solution {
    public int trap(int[] height) {
        final int n=height.length;
        int sum=0;
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=height[0];
        for(int i=1;i<n;i++)
        {
            l[i]=Math.max(l[i-1],height[i]);
        }
        r[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(r[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            int he=Math.min(l[i],r[i]);
            sum=sum+he-height[i];
        }
        return sum;
    }
}