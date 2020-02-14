package homework4;

public class Task2 {
    public static void main(String[] args) {
        int number = 791;
        String string = "";

        while (number != 0) {
            if (number % 2 == 1) {
                string = string + "1";
            } else {
                string = string + "0";
            }
            number = number / 2;
        }

        StringBuffer binaryNumber = new StringBuffer(string);
        binaryNumber.reverse();

        System.out.println(binaryNumber);
    }
}
