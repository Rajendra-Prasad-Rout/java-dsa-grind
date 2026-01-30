package BasicMaths;

public class PerfectNumber {

    public static void main(String[] args) {
        int num = 6, sum = 0;

        for (int i = 1; i < num - 1; i++) {
            if (num % i == 0)
                sum += i;
        }

        System.out.println(num + " is a perfect number ? " + ((num == sum) ? "Yes" : "No"));

    }
}
