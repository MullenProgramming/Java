// This is a very inefficient solution as far as speed is concerned.

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        return str.equals(new StringBuilder().append(str).reverse().toString());
    }
}
