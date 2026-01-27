package BasicMaths;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121, copy = num, rev = 0;

        while (num > 0) {
           int last = num % 10;
           rev = (rev * 10) + last;
           num /= 10;
        }

        System.out.println("Is number " + copy + " palindrome ? " + ((rev == copy) ? "Yes" : "No") );
    }
}
