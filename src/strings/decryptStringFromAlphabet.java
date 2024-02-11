package strings;

import static java.lang.Integer.parseInt;

public class decryptStringFromAlphabet {
    public static void main(String[] args){
        String s = "10#11#12";
        String ans = freqAlphabets(s);
        System.out.println(ans);
    }

    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(i + 2 < s.length() && s.charAt(i + 2) == '#'){
                int num = Integer.parseInt(s.substring(i, i + 2));
                ans.append((char) ('a' + num - 1));
                i += 3;
            }else{
                int num = Character.getNumericValue(s.charAt(i));
                ans.append((char)('a' + num - 1));
                i++;
            }
        }
        return ans.toString();
    }
}
