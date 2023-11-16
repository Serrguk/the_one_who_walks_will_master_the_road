package com.walking.lesson4_Cycles.task4_SumAndDifference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Ввести с клавиатуры целое число (Число 2).
        //  Для каждого из чисел от 1 до 10 выполнить:
        //  Если число1 четное, вывести сумму двух чисел (пр.1), если нет - разность(пр.2).
        //  Также если числа равны - вывести надпись "числа равны!".
        //  пр1.: "Число1 + Число2 = Сумма", где число1 - значение 1го числа (от 1 до 10),
        //  число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
        //  пр2.: "Число1 - Число2 = Разность", где число1 - значение 1го числа (от 1 до 10),
        //  число2 - значение введенного с клавиатуры числа, Разность - результат вычитания.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int input = scanner.nextInt();
        scanner.close();
        calculate(input);

    }
    static void calculate(int input) {
        for (int i = 1; i <= 10; i++) {
            if (i == input) {
                System.out.println(i + " - числа равны!");
            } else if (i % 2 == 0) {
                System.out.printf("%d - чётное число. Сумма чисел: %d\n", i, i + input);
            }else {
                System.out.printf("%d - нечётное число. Разность чисел: %d\n", i, i - input);
            }
        }
    }
}
