class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }
        
        int sum = 1;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int cr = num / i;
                if (i != cr) {
                    sum += cr;
                }
            }
        }
        
        return sum == num;
    }
}
