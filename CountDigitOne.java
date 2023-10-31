class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int factor = 1;
        
        while (factor <= n) {
            int divisor = factor * 10;
            count += (n / divisor) * factor + Math.min(Math.max(n % divisor - factor + 1, 0), factor);
            factor *= 10;
        }
        
        return count;
    }
}
