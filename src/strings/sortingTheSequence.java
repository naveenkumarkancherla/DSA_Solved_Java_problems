package strings;

public class sortingTheSequence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSequence(s);
        System.out.println(ans);
    }

    public static String sortSequence(String s) {
        String[] sArr = s.split(" ");
        String[] sortedWords = new String[sArr.length];

        for(String item : sArr){
            int index = item.charAt(item.length() - 1) - '1';
            sortedWords[index] = item.substring(0,item.length() - 1);
        }
        return String.join(" ",sortedWords);
    }
}
