package recursionNaveen;

public class firstUpperCaseLetter {
    public static void main(String[] args) {
        String str = "gEeksforGeeKs";
        char ans = first(str, 0);
        System.out.println(ans);
    }

    private static char first(String str,int index) {
        // base condition
        if(index == str.length()){
            return 0;
        }
            if(Character.isUpperCase(str.charAt(index))) {
                return str.charAt(index);
            }
          return first(str, index+1);
    }
}
