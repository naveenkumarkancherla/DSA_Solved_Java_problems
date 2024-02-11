package strings;

public class robotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "LL";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    public static boolean judgeCircle(String moves) {
        int[] arr = new int[26];

        for(char ch : moves.toCharArray()){
            arr[ch - 'A']++;
        }

        return (arr['D' - 'A'] == arr['U' - 'A'] && arr['L' - 'A'] == arr['R' - 'A']);
    }
}
