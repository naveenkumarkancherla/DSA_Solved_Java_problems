package strings;

public class halvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
    public static boolean halvesAreAlike(String s){
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0 ; i < s.length() / 2; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count1++;
            }
            if(vowels.indexOf(s.charAt(i + s.length() / 2)) != -1){
                count2++;
            }

        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}
