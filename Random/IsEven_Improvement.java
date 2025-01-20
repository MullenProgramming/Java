// Instead of using `number % 2 == 0` to check if a number is even or odd,
// it's more efficient to use (number & 1) == 0 as it removes the need for 
// division operations by just simply looking at the first bit of the number
// and checking whether or not it's 0 (even) or 1 (odd).
// 
// NOTE: Parentheses must be included: `(num&1) == 0` will work, `num&1 == 0` will not. 

public class IsEven {
    public static boolean isEven(int num){
        if((num&1) == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        int n = 304894842;
        int j = 250084801;
        System.out.printf("%d is " + (isEven(n) ? "even!" : "not even!") + "\n", n);
        System.out.printf("%d is " + (isEven(j) ? "even!" : "not even!") + "\n", j);
    }
}
