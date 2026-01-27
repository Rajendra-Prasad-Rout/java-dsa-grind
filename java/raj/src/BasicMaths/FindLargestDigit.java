package BasicMaths;

public class FindLargestDigit {

    public static void main(String[] args) {
        int num = 372, largest = 0, copy = num;
        while (num > 0) {
            int last = num % 10;
            if (last > largest)
                largest = last;
            num /= 10;
        }
        System.out.println("Largest digit of " + copy + " = " + largest);
    }
}
