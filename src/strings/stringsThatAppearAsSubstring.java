package strings;

public class stringsThatAppearAsSubstring {
    public static void main(String[] args) {
        String[] pattern = {"a","a","a"};
        String word = "ab";
        int ans = numOfStrings(pattern, word);
        System.out.println(ans);
    }

    public static int numOfStrings(String[] pattern, String word) {
        int count = 0;
        for(String str : pattern){
            if(word.contains(str)){
                count++;
            }
        }
        return count;
    }
}
