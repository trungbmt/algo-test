class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];

        for (int r = 0; r < M.length; ++r)
            for (int c = 0; c < M[0].length; ++c) {
                int count = 0;
                for (int i = r-1; i <= r+1; ++i)
                    for (int j = c-1; j <= c+1; ++j) {
                        if (0 <= i && i < M.length && 0 <= j && j < M[0].length) {
                            result[r][c] += M[i][j];
                            count++;
                        }
                    }
                result[r][c] /= count;
            }
        return result;
    }
}