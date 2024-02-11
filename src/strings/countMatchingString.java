package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countMatchingString {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
       list.add(Arrays.asList("phone","blue","pixel"));
       list.add(Arrays.asList("computer","silver","lenovo"));
       list.add(Arrays.asList("phone","gold","iphone"));
       String ruleKey = "color";
       String ruleValue = "silver";
       int ans = countMatches(list, ruleKey, ruleValue);
        System.out.println(ans);
    }

    public static int countMatches(List<List<String>> list, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> str : list){
            if(     ruleKey.equals("type") && ruleValue.equals(str.get(0)) ||
                    ruleKey.equals("color") && ruleValue.equals(str.get(1)) ||
                    ruleKey.equals("name") && ruleValue.equals(str.get(2))
             ){
               count++;
            }
        }
        return count;
    }


}
