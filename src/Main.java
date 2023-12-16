import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // На вход подается два числа.
        // Пропишите хотя бы 2 блока try,
        // чтобы словить исключения и подумайте над приоритетом
        int a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println(" Вводить можно только числа! \n" +
                    " Перезагрузите программу ");
            System.exit(0);
        }
        try {
            System.out.println(a / b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Деление на ноль невозможно!");
        } catch (InputMismatchException input) {
            System.out.println("Введите пожалуйста цифры либо числа !");
        } finally {
            System.out.println("Решено!");
        }
    }
}