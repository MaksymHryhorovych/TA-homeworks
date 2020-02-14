package homework3;

public class Task5 {
    public static void main(String[] args) {
        final String SYMBOL = "* ";
        int lineCounter = 1;
        int symbolCounter = 1;

        while (lineCounter <= 5) {
            int spaceCounter = 5;
            int symbol = 0;

            while (spaceCounter > lineCounter) {
                System.out.print("  ");
                spaceCounter--;
            }

            while (symbol < symbolCounter && symbolCounter < 10) {
                System.out.print(SYMBOL);
                symbol++;
            }

            System.out.println();
            symbolCounter = symbolCounter + 2;
            lineCounter++;
        }

        symbolCounter = 1;

        while (lineCounter > 5 && lineCounter <= 10) {
            int spaceCounter = 10;
            int symbol = 0;

            while (spaceCounter > lineCounter) {
                System.out.print("  ");
                spaceCounter--;
            }

            while (symbol < symbolCounter && symbolCounter < 10) {
                System.out.print(SYMBOL);
                symbol++;
            }

            System.out.println();
            symbolCounter = symbolCounter + 2;
            lineCounter++;
        }
    }
}
