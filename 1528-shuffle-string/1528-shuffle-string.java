class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] s1=new char[n];
        int i=0;
        for(int a:indices)
        {
            s1[a]=s.charAt(i);
            i++;
        }
        String s2=new String(s1);
        return s2;
    }
}