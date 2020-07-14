package homework.lesson3;

import java.util.Scanner;
/*Написать программу, вычисляющую и отображающую все числа
Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами: с помощью цикла и с помощью
рекурсии.*/
public class Task2 {
    // 1 1 2 3 5 7 11 18 29
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        fibonacciCycle(value);
    }

    private static void fibonacciRecursion(int value){
        int value1 = 1;
        int value2 = 0;
        int sum;
        System.out.print(1 + " ");
        for (int i = 0; i < value; i++){
            value1 = value2;
        }

    }

    private static void fibonacciCycle(int value) {
        int value1 = 1;
        int value2 = 0;
        int sum;
        System.out.print(1 + " ");

        for (int i = 0; i < value; i++) {
            sum = value1 + value2;
            value2 = value1;
            value1 = sum;
            if (sum > value){
                break;
            } else {
                System.out.print(sum + " ");
            }
        }
    }
}
