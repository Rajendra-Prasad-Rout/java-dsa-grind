package BasicMaths;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 84672, rev = 0;
        while(num > 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;
        }
        System.out.println("Reverse Num: " + rev);
    }
}
