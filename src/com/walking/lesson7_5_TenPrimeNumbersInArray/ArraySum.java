package com.walking.lesson7_5_TenPrimeNumbersInArray;

public class ArraySum {

    // Рекурсивный метод для вычисления суммы элементов массива
    public static int sumArray(int[] array) {
        return sumArrayHelper(array, 0, 0);
    }

    private static int sumArrayHelper(int[] array, int index, int sum) {
        // Базовый случай: если индекс вышел за пределы массива, возвращаем текущую сумму
        if (index >= array.length) {
            return sum;
        }

        // Добавляем текущий элемент к сумме
        sum += array[index];

        // Рекурсивно вызываем метод для следующего элемента
        return sumArrayHelper(array, index + 1, sum);
    }
}
