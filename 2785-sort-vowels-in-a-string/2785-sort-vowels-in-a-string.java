class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        char[] c=s.toCharArray();
        List<Character> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char f=Character.toLowerCase(c[i]);
            if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u')
            {
                li.add(c[i]);
                c[i]='0';
            }
        }
        Collections.sort(li);
        int v=0;
        for(int i=0;i<n;i++)
        {
            if(c[i]=='0')
            {
                c[i]=li.get(v);
                v++;
            }
        }
        return new String(c);
    }
}