package BasicMaths;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Is " + num + " a prime number ? " + isPrime(num) );
    }

    static String isPrime(int n) {
        if (n < 2)
            return "No";

        for (int i = 2; i < n; ++i) {
            if (n % i == 0)
                return "No";
        }

        return "Yes";
    }
}
