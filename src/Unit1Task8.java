import java.util.Scanner;

public class Unit1Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first = scan.nextInt();
        System.out.println("Введите второе число");
        int second = scan.nextInt();

        if (first>second) {
            System.out.println("Большее число " + first);
        } else
            System.out.println("Большее число " + second);
    }
}

// Ввести 2 числа с клавиатуры используя Scanner или BufferedReader. Вывести большее из них.
