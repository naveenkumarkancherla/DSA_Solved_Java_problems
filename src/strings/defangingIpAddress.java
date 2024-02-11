package strings;

import java.util.Arrays;

public class defangingIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }

     static String defangIPaddr(String address) {
         StringBuilder defanged = new StringBuilder();

         for(int i = 0 ; i < address.length(); i++){
             char ch = address.charAt(i);
             if(ch == '.' ){
                 defanged.append("[.]");
             }
             else{
                 defanged.append(ch);
             }
         }
        return defanged.toString();
    }
}
