    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // The deque in this case will act as a "sliding window" array.
            Deque<Integer> deck = new ArrayDeque<>();
            int n = scan.nextInt();
            int m = scan.nextInt();
            int uniqueCount = 0;

    // Creates a map to track the frequency of each value 0 - 9.
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                deck.addFirst(num); // Adds element to front of deque.
                
                // If the key did not exist, it would have no original value.
                // So if there is no value, freqMap.getOrDefault(num, 0) inserts a 0 as a default
                // value, then the +1 adds 1 to either the default or whatever was already there.
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                
                if(deck.size() == m){
                    // To get the number of distinct/unique values in subarray M,
                    // we can just simply use the size of the frequency map.
                    if(freqMap.size() > uniqueCount){
                        uniqueCount = freqMap.size();
                    }
                    int removed = deck.removeLast();
                    // We need to check the last element removed from subarray M in the
                    // frequency map to see if we need to remove that key (if the value == 0).
                    int freqCheck = freqMap.get(removed) - 1;
                    if(freqCheck == 0){
                        freqMap.remove(removed);
                    } else {
                        freqMap.put(removed, freqCheck);
                    }
                }
            }
            scan.close();
            System.out.println(uniqueCount);
        }
    }
