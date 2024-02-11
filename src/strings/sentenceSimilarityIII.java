package strings;

public class sentenceSimilarityIII {
    public static void main(String[] args) {
        String sentence1 = "CwFfRo regR";
        String sentence2 = "CwFfRo H regR";
        boolean ans = areSentencesSimilar(sentence1, sentence2);
        System.out.println(ans);
    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
    String[] s1 = sentence1.split(" ");

    String[] s2 = sentence2.split(" ");
    return isSimilar(sentence1,s2) || isSimilar(sentence2,s1);
    }

    public static boolean isSimilar(String sentence1, String[] s2) {
        int count= 0;

        for(int i = 0; i < s2.length; i++){
            if(sentence1.contains(s2[i])){
                count++;
            }
        }
        if(count == s2.length){
            return true;
        }
        return false;
    }
}
