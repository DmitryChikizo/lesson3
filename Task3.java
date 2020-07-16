package homework.lesson3;

import java.util.Scanner;

public class Task3 {
    /*3. Написать программу, отображающую статистику по осадкам
за N дней. N вводится пользователем.
    Пользователь также должен ввести N целых чисел, обозначающих
величину осадков в день.
    Программа должна выводить:
a. Количество дней
b. Сумму осадков за этот период
c. Среднее количество осадков за этот период
d. Максимальное количество дневных осадков за этот период
    Не использовать массивы!
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfDays = scanner.nextInt();

        int sumOfRainfall = 0;
        int maxRainfall = 0;

        for (int i = 1; i <= amountOfDays; i++) {
            System.out.println("Введите количество осадков за день № - " + i);
            int amountOfRainfall = scanner.nextInt();
            sumOfRainfall = sumOfRainfall + amountOfRainfall;
            if (maxRainfall < amountOfRainfall) {
                maxRainfall = amountOfRainfall;
            }
        }

        System.out.println("Количество дней - " + amountOfDays + ";");
        System.out.println("Сумма осадков за этот период - " + sumOfRainfall + ";");
        System.out.println("Среднее количество осадков за этот период - " + sumOfRainfall / amountOfDays + ";");
        System.out.println("Максимальное количество дневных осадков за этот период - " + maxRainfall + ";");
    }
}
