class Solution {
    public boolean isFascinating(int n) {
        String s1 = Integer.toString(n);
    String s2 = Integer.toString(n * 2);
    String s3 = Integer.toString(n * 3);
    String s = s1 + s2 + s3;
    
    if (s.length() != 9) {
        return false;
    }

    boolean[] digits = new boolean[10]; 
    
    for (int i = 0; i < s.length(); i++) {
        int digit = s.charAt(i) - '0';
        if (digit < 1 || digit > 9 || digits[digit]) {
            return false; 
        }
        digits[digit] = true;
    }
    
    for (int i = 1; i <= 9; i++) {
        if (!digits[i]) {
            return false;
        }
    }
    
    return true;
    }
}