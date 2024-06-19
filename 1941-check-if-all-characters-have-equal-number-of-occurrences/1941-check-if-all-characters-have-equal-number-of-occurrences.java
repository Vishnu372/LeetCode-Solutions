class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int val=0;
        for(Map.Entry<Character,Integer> set: map.entrySet())
        {
         val=set.getValue();
        }
        for(Map.Entry<Character,Integer> set: map.entrySet())
        {
            if(val!=set.getValue())
            {
                return false;
            }
        }
        return true;
    }
}