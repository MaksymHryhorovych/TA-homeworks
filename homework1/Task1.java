package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your symbol");
        Scanner scanner = new Scanner(System.in);
        String sym = scanner.nextLine();

        System.out.println(sym + sym + sym + sym + sym + " " + sym + sym + sym + sym + sym + "     " + sym + "     " + sym + "     " + sym);
        System.out.println(sym + "     " + sym + "   " + sym + "    " + sym + " " + sym + "    " + sym + sym + "   " + sym + sym);
        System.out.println(sym + sym + sym + sym + sym + " " + sym + sym + sym + sym + sym + "   " + sym + "   " + sym + "   " + sym + " " + sym + " " + sym + " " + sym);
        System.out.println(sym + "     " + sym + "      " + sym + sym + sym + sym + sym + sym + sym + "  " + sym + "  " + sym + "  " + sym);
        System.out.println(sym + sym + sym + sym + sym + " " + sym + "     " + sym + "       " + sym + " " + sym + "     " + sym);
    }
}
//***** *****     *     *     *
//*     *   *    * *    **   **
//***** *****   *   *   * * * *
//*     *      *******  *  *  *
//***** *     *       * *     *