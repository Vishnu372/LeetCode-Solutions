class Solution {
    public int findJudge(int n, int[][] trust) {
        int m=trust.length;
        int[] in=new int[n+1];
        int[] out=new int[n+1];
        Arrays.fill(in,0);
        for(int i=0;i<m;i++)
        {
            in[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(in[i]==n-1&&out[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
