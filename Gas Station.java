public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int fuel = 0;
        int sum = 0;
        int start = 0;
        for(int i = 0; i < A.length; i++) {
            sum = sum + (A[i] - B[i]);
            fuel = fuel + (A[i] - B[i]);
            if(fuel < 0){
                fuel = 0;
                start = i+1;
            }
        }
        return sum >= 0 ? start % A.length : -1;
    }
}
