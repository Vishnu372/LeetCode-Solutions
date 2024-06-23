class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words)
        {
            boolean flag=true;
            int n=str.length();
            for(int i=0;i<n/2;i++)
            {
                    if(str.charAt(i)==str.charAt(n-i-1))
                    {
                        flag=true;
                    }
                    else
                    {
                        flag=false;
                        break;
                    }
            }
            if(flag==true)
            {
                return str;
            }
        }
        return "";
    }
}