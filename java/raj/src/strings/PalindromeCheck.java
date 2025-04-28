package strings;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "racecar";
        palindromeCheck(str);
    }

    /**
     * Checks whether the given string is a palindrome.
     * <p>
     * This method reverses the input string and compares it to the original.
     * </p>
     *
     * @param str the input string to check for palindrome property
     */
    static void palindromeCheck(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println(str + " is palindrome ? " + (str.equals(reverse) ? "Yes" : "No"));
    }
}
