class Solution {
    public String sortSentence(String s) {
        String s1="";
        String[] sar=s.split(" ");
        int n=sar.length;
        String[] sar1=new String[n];
        for(int i=0;i<n;i++)
        {
            int n2=sar[i].length();
            int in=sar[i].charAt(n2-1)-'1';
            sar1[in]=sar[i].substring(0,n2-1);
        }
        for(int i=0;i<sar.length-1;i++)
        {
            s1+=sar1[i]+" ";
        }
        s1=s1+sar1[n-1];
        return s1;
    }
}