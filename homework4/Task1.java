package homework4;

public class Task1 {
    public static void main(String[] args) {
        String string = "Java homework number four";
        String uniqueSymbols = "";
        int symbol = 0;
        while (symbol < string.length()) {
            if (string.indexOf(string.substring(symbol, symbol + 1)) == string.lastIndexOf(string.substring(symbol, symbol + 1))) {
                uniqueSymbols = uniqueSymbols + string.substring(symbol, symbol + 1);
            }
            symbol++;
        }

        System.out.println(uniqueSymbols);
    }
}
