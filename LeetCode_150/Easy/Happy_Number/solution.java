class Solution {
    // helper method to square the digits of n.
    public int squareN(int n){
        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            int temp = s.charAt(i) - '0';
            sum += temp * temp;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = squareN(n);
        while(!set.contains(sum)){
            if(sum == 1) return true;
            set.add(sum);
            sum = squareN(sum);
        }
        return false;
    }
}
