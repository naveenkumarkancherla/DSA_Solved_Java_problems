package strings;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String s){
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length -1].length();
    }


}
