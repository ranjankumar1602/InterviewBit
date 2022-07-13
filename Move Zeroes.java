public class Solution {
    public int[] solve(int[] A) {
        int temp=0,count=0;
        for(int i=0;i<A.length;i++) {
            if(A[i]!=0) {
                A[temp]=A[i];
                temp++;
            }else {
                count++;
            }
        }
        for(int i=A.length-count;i<A.length;i++) {
            A[i]=0;
        }
        return A;
    }
}
