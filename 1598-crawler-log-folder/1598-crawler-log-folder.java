class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count<0)
            {
                count=0;
            }
            String s=logs[i];
            if(s.equals("../"))
            {
                count--;
            }
            else if(s.equals("./"))
            {
                continue;
            }
            else
            {
                count++;
            }
        }
       int val=(count>0)?count:0;
       return val;
    }
}