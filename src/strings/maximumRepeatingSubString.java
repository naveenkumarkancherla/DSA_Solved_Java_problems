package strings;

public class maximumRepeatingSubString {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        int ans = maxRepeating(sequence, word);
        System.out.println(ans);
    }

    public static int maxRepeating(String sequence, String word) {
        int maxCount = 0;
        StringBuilder repeatedWord = new StringBuilder(word);

        while (sequence.contains(repeatedWord)) {
            maxCount++;
            repeatedWord.append(word);
        }

        return maxCount;
    }
}
