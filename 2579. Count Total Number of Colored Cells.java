class Solution {
    public long coloredCells(int n) {
        long output=1;
        for(int i=1;i<n;i++){
            output+=4*i;
        }
        return output;
    }
}

94 / 94 test cases passed.
Status: Accepted
Runtime: 3 ms
