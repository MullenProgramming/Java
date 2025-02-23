class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations.length == 1) return citations[0] == 0 ? 0 : 1;
        if(citations.length-1 == 0) return 0;

        int count = 0;
        int hIndex = 0;
        for(int i = citations.length-1; i >= 0; i--){
            count++;
            if(citations[i] >= count){
                hIndex = count;
            } else {
                if(hIndex < citations[i]){
                    hIndex = citations[i];
                }
            } 
        }
        return hIndex;
    }
}
