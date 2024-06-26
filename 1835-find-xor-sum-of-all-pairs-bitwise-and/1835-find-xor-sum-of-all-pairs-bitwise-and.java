class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int ans1=0;
        int ans2=0;
        for(int val:arr1)
        {
            ans1^=val;
        }
        for(int val:arr2)
        {
            ans2^=val;
        }
        return ans1&ans2;
    }
}