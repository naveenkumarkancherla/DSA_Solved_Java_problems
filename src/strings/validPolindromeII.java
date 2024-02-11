package strings;

public class validPolindromeII {
    public static void main(String[] args) {
        String s ="abca";
        boolean ans = validPolindromeII(s);
        System.out.println(ans);
    }
    public static boolean validPolindromeII(String s){
       int left = 0, right = s.length() - 1;
       while(left < right){
           if(s.charAt(left) != s.charAt(right)){
               return isPolindrome(s,left + 1,right) || isPolindrome(s,left,right - 1);
           }
           left++;
           right--;
       }
       return true;
    }

    private static boolean isPolindrome(String s, int i, int j) {
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
