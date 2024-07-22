class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        int index=0;
        String[] star=new String[n];
        for(int i=0;i<n;i++)
        {
            int a=0;
            for(int j=0;j<n;j++)
            {
                a=Math.max(a,heights[j]);
            }
            index=findIndex(heights,a);
            star[i]=names[index];
            heights[index]=0;
        }
        return star;
    }
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }
}
