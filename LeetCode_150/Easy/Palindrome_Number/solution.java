// RULE: No String conversion

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = x;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10; // This removes the last digit of n.
        }
        return reversed == x ? true : false;
    }
}
