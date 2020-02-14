package homework3;

public class Task4 {
    public static void main(String[] args) {
        final String SYMBOL = "* ";
        int lineCounter = 1;

        while (lineCounter <= 5) {
            int spaceCounter = 5;
            int symbolCounter = 0;

            while (spaceCounter > lineCounter) {
                System.out.print("  ");
                spaceCounter--;
            }

            while (symbolCounter < lineCounter) {
                System.out.print(SYMBOL);
                symbolCounter++;
            }
            System.out.println();
            lineCounter++;
        }

        while (lineCounter > 5 && lineCounter <= 10) {
            int spaceCounter = 5;
            int symbolCounter = 10;

            while (spaceCounter < lineCounter) {
                System.out.print("  ");
                spaceCounter++;
            }

            while (symbolCounter > lineCounter) {
                System.out.print(SYMBOL);
                symbolCounter--;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
