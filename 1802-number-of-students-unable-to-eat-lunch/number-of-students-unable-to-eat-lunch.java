class Solution {
    public int countStudents(int[] studs, int[] sndws) {
        int ones = 0; 
        int zeros = 0; 
        for (int s = 0; s < studs.length; s++) {
            if (studs[s] == 0) zeros++;
            else ones++;
        }

        for (int sndw : sndws) {
            if (sndw == 0) { if (zeros == 0) return ones; zeros--; } 
            else { if (ones == 0) return zeros; ones--; }
        }
        return 0;
    }
}