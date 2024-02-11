package strings;

public class logestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"dog","racecar","car"};
        String ans = longestCommonPrefix(s);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] s) {
        if(s == null || s.length == 0){
            return "";
        }
        String shortest = s[0];
        StringBuilder ans = new StringBuilder();
       for(String str : s){
           if(shortest.length() > str.length()){
               shortest = str;
           }
       }
       for(int i = 0 ; i < shortest.length(); i++){
           char currentChar = shortest.charAt(i);
           for(String str : s){
               if(currentChar != str.charAt(i)){
                   return ans.toString();
               }
           }
           ans.append(currentChar);
       }

        return ans.toString();
    }
}
