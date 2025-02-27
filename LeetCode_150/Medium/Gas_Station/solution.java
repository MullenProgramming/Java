class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;

    // If the total amount of cost is greater than gas, then
    // the circle cannot be completed, so return -1;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        
        totalGas = 0; // reset
    // For this loop, we find the earliest index that can reach the end,
    // which would then guarantee a full loop.
        for(int j = 0; j < gas.length; j++){
            totalGas += gas[j];
            totalGas -= cost[j];
            if(totalGas < 0){
                start = j+1; // start++ is incorrect, must be set to the next j index.
                totalGas = 0; // reset
            }
        }
        return start;
    }   
}
