class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase(); // Reassign to make s lowercase
        int n = s.length();
        int c1 = 0, c2 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                c1++;
            }
        }
        for (int i = n / 2; i < n; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                c2++;
            }
        }
        return c1 == c2;
    }
}
