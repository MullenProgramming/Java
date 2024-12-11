import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b){
// **************************** MY CODE STARTS BELOW ****************************
// Below code gives a big O runtime of n. Time complexity = O(n), space complexity = O(1).
        if(a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] alphabetArr = new int[26];
        
        // Add or subtract a value to/from the alphabetArr based on what the index number of
        // the ASCII value. ie - 'a' - 'a' = 0, 'b' - 'a' = 1, etc...
        // Example, "apple" would result in: 
        // alphabetArr[1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,2,0,0,0,0,0,0,0,0,0,0]
        for(int i=0; i<a.length(); i++){
            alphabetArr[a.charAt(i) - 'a']++;
            alphabetArr[b.charAt(i) - 'a']--;
        }
        // If both strings are anagrams of eachother, array should be all zeroes.
        for(int i=0; i<alphabetArr.length; i++){
            if(alphabetArr[i] != 0) return false;
        }
        return true;
      
        // **************** OLDER, LESS EFFICIENT CODE ******************
        // char[] charArrA = a.toCharArray();
        // char[] charArrB = b.toCharArray();
        // Arrays.sort(charArrA);
        // Arrays.sort(charArrB);
        // String sortedA = new String(charArrA);
        // String sortedB = new String(charArrB);
        // return sortedA.compareTo(sortedB) == 0;
        // **************************************************************
    }
// ********************************************************************************

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
