class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>triangle=new ArrayList<>();
        if(n==0)
        {
            return triangle;
        }
        List<Integer> first=new ArrayList<>();
        first.add(1);
        triangle.add(first);
        for(int i=1;i<n;i++)
        {
            List<Integer> pre=triangle.get(i-1);
            List<Integer> col=new ArrayList<>();
            col.add(1);
            for(int j=1;j<i;j++)
            {
                col.add(pre.get(j-1)+pre.get(j));
            }
            col.add(1);
            triangle.add(col);
        }
        return triangle;
    }
}