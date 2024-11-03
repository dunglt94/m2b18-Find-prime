public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Optimized:" + i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
