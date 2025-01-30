class Solution {
    public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if(romans.length == 1) return map.get(romans[0]);
        for(int i = 0; i < romans.length; i++){
            int n = map.get(romans[i]);
            sum += n;
            if(i > 0 && n > map.get(romans[i-1])){
                sum -= 2 * map.get(romans[i-1]);
            }
        }
        return sum;
    }
}
