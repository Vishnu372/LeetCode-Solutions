class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int n1=word2.length();
        String s="";
        int v=0,v1=0;
        while(v<n||v1<n1)
        {
            if(v<n)
            {
                s+=word1.charAt(v);
                v++;
            }
            if(v1<n1)
            {
                s+=word2.charAt(v1);
                v1++;
            }
        }
        return s;
    }
}