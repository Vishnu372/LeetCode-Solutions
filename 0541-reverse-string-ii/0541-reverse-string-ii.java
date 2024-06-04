class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        
        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1);
            
            while (i < j) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(charArray);
    }
}
