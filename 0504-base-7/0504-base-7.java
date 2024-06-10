class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        
        boolean isNegative = num < 0;
        num = Math.abs(num);
        
        StringBuilder base7 = new StringBuilder();
        
        while (num > 0) {
            int remainder = num % 7;
            base7.append(remainder);
            num /= 7;
        }
        
        if (isNegative) {
            base7.append('-');
        }
        return base7.reverse().toString();
    }
}
