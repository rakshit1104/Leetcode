class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        //Checking
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;
                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        //Marking 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /* public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) firstRow = true;
                    if(j == 0) firstCol = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        } */
}