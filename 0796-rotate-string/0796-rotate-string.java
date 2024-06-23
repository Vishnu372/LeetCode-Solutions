class Solution {
    public boolean rotateString(String s, String goal) {
    int n1 = s.length();
    int go = goal.length();

    if (n1 !=go) {
        return false;
    }
        String c=s+s;
        return c.contains(goal);
    }
}