class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int current = 1;
        int nextGuess = 2;
        while(nextGuess <= x/2){
            if((long) nextGuess * (long) nextGuess == x){
                return nextGuess;
            } else if((long) nextGuess * (long) nextGuess > x){
                return current;
            } else {
                current = nextGuess;
                nextGuess++;
            }
        }
        return current;
    }
}
