package strings;

public class reverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    public static String reverseWords(String s){
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word : str){
            for(int i = word.length() - 1 ; i >= 0; i--){
                ans.append(word.charAt(i));
            }
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
