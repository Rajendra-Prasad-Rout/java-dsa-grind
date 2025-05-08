package BasicMaths;

public class CountDigits {

    public static void main(String[] args) {
        int num = 71348;
        countDigits(num);
        countOddDigits(num);
    }

    static void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println("Digits Count: " + count);
    }

    static void countOddDigits(int num) {
        int count = 0;
        if (num == 0) {
            System.out.println("Odd Digits Count: " + count);
        }

        while (num > 0) {
            if (num % 2 != 0) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Odd Digits Count: " + count);
    }
}
