class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int val=0;
            for(int j=0;j<n;j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    val+=Math.abs(i-j);
                }
            }
            arr[i]=val;
        }
        return arr;
    }
}