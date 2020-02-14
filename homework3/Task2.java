package homework3;

public class Task2 {
    public static void main(String[] args) {
        final String SYMBOL = "* ";
        int lineCounter = 1;

        while (lineCounter <=5) {
            int symbolCounter = 6;
            int spaceCounter = 1;

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
