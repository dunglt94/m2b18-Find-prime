public class Main {
    public static void main(String[] args) {
        Runnable optimize = new OptimizedPrimeFactorization();
        Runnable lazy = new LazyPrimeFactorization();


        Thread optimizeThread = new Thread(optimize);
        Thread lazyThread = new Thread(lazy);

        lazyThread.start();
        optimizeThread.start();

    }
}
