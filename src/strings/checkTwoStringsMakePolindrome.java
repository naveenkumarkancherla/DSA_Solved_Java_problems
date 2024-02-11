package strings;

public class checkTwoStringsMakePolindrome {
    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";
        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return canFormPalindrome(a, b) || canFormPalindrome(b, a);
    }

    private static boolean canFormPalindrome(String a, String b) {
        int n = a.length();
        int i = 0, j = n - 1;

        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }

        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
