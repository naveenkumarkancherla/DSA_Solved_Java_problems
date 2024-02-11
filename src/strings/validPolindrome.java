package strings;

public class validPolindrome {
    public static void main(String[] args) {
        String s = " ";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() -1;
        while(left < right){
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(!(Character.isLetterOrDigit(leftChar))){
                left++;
            }else if(!(Character.isLetterOrDigit(rightChar))){
                right--;
            }else{
                if(leftChar == rightChar){
                    left++;
                    right--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
