class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char c[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(c);
        if(Arrays.equals(a,c)){
            return true;
        }
        else{
            return false;
        }
        
    }
}