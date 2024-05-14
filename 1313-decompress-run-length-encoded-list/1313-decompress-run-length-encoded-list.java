class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            fun(nums[i],nums[i+1],li);
            i++;
        }
        int n1=li.size();
        int[] res=new int[n1];
        for(int i=0;i<n1;i++)
        {
            res[i]=li.get(i);
        }
        return res;
    }
    private List<Integer> fun(int v1,int v2,List<Integer> li)
    {
        for(int i=0;i<v1;i++)
        {
            li.add(v2);
        }
        return li;
    }
}