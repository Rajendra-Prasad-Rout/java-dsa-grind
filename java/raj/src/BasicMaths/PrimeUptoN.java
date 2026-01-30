package BasicMaths;

public class PrimeUptoN {
    public static void main(String[] args) {
        System.out.println("Prime Numbers Count till 10 is: " + primeUptoN(10));
    }

    private static int primeUptoN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++){
            if (isPrime(i))
                count++;
        }
        return count;
    }

    private static boolean isPrime(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++){
            if (n % i == 0) {
                count += 1;
            }
        }
        return count == 2;
    }
}
