class TilingProblem{
    // Given a 2*n floar and tiles of size 2*1 count the 
    // number of wayes to tiles.
    // (A tile can either be place horizontal or vertically)

     static int countWays(int n) {

        // base cases
        if (n == 1 || n == 0) {
            return 1;
        }

        // recursive call
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(countWays(n));
    }
}