package homework.lesson3;

import java.util.Scanner;

public class Task2 {
    /*Написать программу, вычисляющую и отображающую все числа
Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами: с помощью цикла и с помощью
рекурсии.
1 1 2 3 5 7 11 18 29*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило Фибоначчи: ");
        int value = scanner.nextInt();

        fibonacciValues(value);

        int fibonacciByCycle = calculateFibonacciByCycle(value);
        System.out.println("Сумма циклическим методом - " + (fibonacciByCycle - 1));

        int fibonacciByRecursion = calculateFibonacciByRecursion(value);
        System.out.println("Сумма рекурсивным методом - " + (fibonacciByRecursion - 1));
    }

    private static void fibonacciValues(int value){
        int value1 = 1;
        int value2 = 0;
        int sum;
        System.out.print(value2 + " " + value1 + " ");

        for (int i = 0; i < (value - 2); i++) {
            sum = value1 + value2;
            value2 = value1;
            value1 = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    private static int calculateFibonacciByCycle(int value) {
        int value1 = 1;
        int value2 = 0;
        int sum = 0;

        while (sum < value) {
            for (int i = 0; i < value; i++) {
                sum = value1 + value2;
                value2 = value1;
                value1 = sum;
            }
        }
        return sum;
    }

    public static int calculateFibonacciByRecursion(int value) {
        if (value == 0){
            return 1;
        }
        if (value == 1) {
            return 1;
        }
        return calculateFibonacciByRecursion(value - 1) + calculateFibonacciByRecursion(value - 2);
    }
}
