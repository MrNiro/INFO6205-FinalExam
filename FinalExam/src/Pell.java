public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        long[] memo = new long[n+1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i <= n; i++){
            memo[i] = 2 * memo[i - 1] + memo[i - 2];
        }


        return memo[n];
    }
}
