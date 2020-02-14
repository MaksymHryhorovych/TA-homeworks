package homework3;

public class Task1 {
    public static void main(String[] args) {
        final String SYMBOL = "* ";
        int lineCounter = 1;

        while (lineCounter <= 5) {
            int counter = 0;
            while (counter < lineCounter) {
                System.out.print(SYMBOL);
                counter++;
            }
            System.out.println();
            lineCounter++;
        }

        while (lineCounter > 5 && lineCounter < 10) {
            int counter = 10;
            while (counter > lineCounter) {
                System.out.print(SYMBOL);
                counter--;
            }
            System.out.println();
            lineCounter++;
        }
    }
}
