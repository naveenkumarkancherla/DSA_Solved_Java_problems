package strings;

public class stringArrayEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a","bc"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(String item : word1){
             ans1.append(item);
        }

        for(String item : word2){
            ans2.append(item);
        }

        return ans1.toString().equals(ans2.toString());
    }
}
