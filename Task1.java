package homework.lesson3;

import java.util.Scanner;

public class Task1 {
/*
1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
* */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = sumOfValue(value);
        System.out.println(sum);
    }

    public static int sumOfValue(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result = result + (currentValue % 10);
            currentValue = currentValue / 10;
        }
        return result;
    }
}
