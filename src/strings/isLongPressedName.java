package strings;

public class isLongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        boolean ans = isLongPressedName(name, typed);
        System.out.println(ans);
    }
    public static boolean isLongPressedName(String name, String typed){
        int i = 0, j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }

        return i == name.length();
        }
}
