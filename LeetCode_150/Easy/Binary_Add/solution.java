class Solution {
    public String addBinary(String a, String b) {
// ----------------------------------------------------------------------
    // Easier method:
        // int aBit = Integer.parseInt(a, 2);
        // int bBit = Integer.parseInt(b, 2);

        // int sum = aBit + bBit;
        // return Integer.toBinaryString(sum);
// ----------------------------------------------------------------------
    // Pain in the ass method:
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
