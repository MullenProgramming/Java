// My solution
class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> romans = new HashMap<>();
        romans.put(1, "I");
        romans.put(2, "II");
        romans.put(3, "III");
        romans.put(4, "IV");
        romans.put(5, "V");
        romans.put(6, "VI");
        romans.put(7, "VII");
        romans.put(8, "VIII");
        romans.put(9, "IX");
        romans.put(10, "X");
        romans.put(20, "XX");
        romans.put(30, "XXX");
        romans.put(40, "XL");
        romans.put(50, "L");
        romans.put(60, "LX");
        romans.put(70, "LXX");
        romans.put(80, "LXXX");
        romans.put(90, "XC");
        romans.put(100, "C");
        romans.put(200, "CC");
        romans.put(300, "CCC");
        romans.put(400, "CD");
        romans.put(500, "D");
        romans.put(600, "DC");
        romans.put(700, "DCC");
        romans.put(800, "DCCC");
        romans.put(900, "CM");
        romans.put(1000, "M");
        romans.put(2000, "MM");
        romans.put(3000, "MMM");

        int temp = num;
        int multiplier = 1;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> parts = new ArrayList<>();

        while(temp > 0){
            int digit = (temp % 10) * multiplier;
            String roman = romans.get(digit);
            parts.add(roman);
            temp /= 10;
            multiplier *= 10;
        }
        for(int i = parts.size()-1; i >= 0; i--){
            if(parts.get(i) != null){
                sb.append(parts.get(i));
            }
        }
        return sb.toString();
    }
}

// A better solution
// class Solution {
//     public String intToRoman(int num) {
//         Map<String, Integer> map = new HashMap();
//         String[] keys = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//         int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
//         StringBuilder ans = new StringBuilder();
//         for(int index = 0; index < keys.length; index++) {
//             while(num >= values[index]) {
//                 ans.append(keys[index]);
//                 num -= values[index];
//             }
//         }

//         return ans.toString();
//     }
// }


