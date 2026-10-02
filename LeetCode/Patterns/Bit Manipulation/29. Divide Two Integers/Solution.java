class Solution {
    public int divide(int dividend, int divisor) {

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
    return Integer.MAX_VALUE;
}

        int ans = 0;

        while (dvd >= dvs) {

            long sum = dvs;
            int c = 1;

            while (sum + sum <= dvd) {
                sum = sum + sum;
                c = c + c;
            }

            dvd = dvd - sum;
            ans = ans + c;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return ans;
    }
}