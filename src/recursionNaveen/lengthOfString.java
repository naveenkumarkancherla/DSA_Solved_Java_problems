package recursionNaveen;

public class lengthOfString {
    public static void main(String[] args) {
        String str = "abcd";
        int ans = length(str);
        System.out.println(ans);
    }
    public static int length(String str){
        // base condition
        if(str.equals("")){
            return 0;
        }

        return length(str.substring(1)) + 1 ;
    }
}
