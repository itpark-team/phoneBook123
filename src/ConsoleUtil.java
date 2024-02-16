import java.util.Scanner;

public class ConsoleUtil {
    public static int inputInt(String message, int min, int max) {
        int output = 0;
        boolean isCorrectInput;

        do {
            try {
                isCorrectInput = true;

                Scanner scanner = new Scanner(System.in);

                System.out.println(message);
                output = scanner.nextInt();

                if (output < min || output > max) {
                    throw new Exception("");
                }

            } catch (Exception e) {
                isCorrectInput = false;

                System.out.println("Ошибка. Вы ввели не число или число за пределами диапазона от " + min + " до " + max);
            }
        } while (isCorrectInput == false);

        return output;
    }

    public static String inputString(String message, int minLength, int maxLength) {
        String output = "";
        boolean isCorrectInput;

        do {
            try {
                isCorrectInput = true;

                Scanner scanner = new Scanner(System.in);

                System.out.println(message);
                output = scanner.nextLine();

                if (output.length() < minLength || output.length() > maxLength) {
                    throw new Exception("");
                }

            } catch (Exception e) {
                isCorrectInput = false;

                System.out.println("Ошибка. Длина вводимой строки должна быть от " + minLength + " до " + maxLength);
            }
        } while (isCorrectInput == false);

        return output;
    }

    public static void printString(String message) {
        System.out.print(message);
    }

    public static void printlnString(String message) {
        System.out.println(message);
    }
}
