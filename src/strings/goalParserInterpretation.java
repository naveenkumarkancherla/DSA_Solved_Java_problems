package strings;

import java.util.Arrays;

public class goalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)()()G";
        String ans = interpret(command);
        System.out.println(ans);
    }

    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                ans.append("G");
            } else if (ch == '(') {
                if (command.charAt(i + 1) == ')') {
                    ans.append("o");
                } else {
                    ans.append("al");
                }
            }
        }
        return new String(ans);
    }
}
