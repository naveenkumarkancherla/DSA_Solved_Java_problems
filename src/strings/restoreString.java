package strings;

public class restoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s, indices);
        System.out.println(ans);
    }
    public static String restoreString(String s, int[] indices) {
    char[] ch = new char[indices.length];
        for(int i = 0 ; i < indices.length; i++){
            ch[indices[i]] = s.charAt(i);
    }
        return new String(ch);
    }
}
