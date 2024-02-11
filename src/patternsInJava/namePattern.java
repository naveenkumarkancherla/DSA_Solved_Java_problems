package patternsInJava;

public class namePattern {
    public static void main(String[] args) {
        String[] naveen = {
                "|     |     *     |       |  |******  |******   |      |",
                "|*    |   *   *   |       |  |        |         |*     |",
                "| *   |  |     |  |       |  |        |         | *    |",
                "|  *  |  -------  |       |  |******  |******   |  *   |",
                "|   * |  |     |   *     *   |        |         |   *  |",
                "|    *|  |     |    *   *    |        |         |    * |",
                "|     |  |     |      *      |******  |******   |      |"
        };

        for (String line : naveen) {
            System.out.println(line);
        }
    }
}
