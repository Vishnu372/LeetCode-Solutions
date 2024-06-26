class Solution {
    public int largestCombination(int[] ca) {
        int[] bit=new int[32];
        int n=ca.length;
        for(int i=0;i<n;i++)
        {
            int c=0;
            int val=ca[i];
            while(val!=0)
            {
                if((val&1)==1)
                {
                    bit[c]++;
                }
                val=val>>1;
                c++;
            }
        }
        int max=0;
        for(int i=0;i<32;i++)
        {
            max=Math.max(max,bit[i]);
        }
        return max;

    }
}