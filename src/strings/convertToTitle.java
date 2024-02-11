package strings;

public class convertToTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        String ans = convertToTitle(columnNumber);
        System.out.println(ans);
    }
    public static String convertToTitle(int columnNumber){
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-indexed system
            int remainder = columnNumber % 26;
            columnTitle.insert(0, (char)('A' + remainder));
            columnNumber /= 26;
        }

        return columnTitle.toString();
    }
}
