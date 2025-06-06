package com.walking.lesson28_Generics.Task4_Stack;

import com.walking.lesson28_Generics.Task4_Stack.model.MyStack;

public class Main {

    // TODO: Реализовать параметризованный класс, хранящий и обрабатывающий стек.
    //  Стек — структура данных, в котором каждый элемент хранит ссылку на следующий.
    //  Работает по принципу LIFO (последний вошел — первый вышел).
    //  Реализовать следующие методы:
    //  1. Добавление элемента в стек;
    //  2. Удаление элемента из стека. При удалении несуществующего элемента – исключение;
    //  3. Получение глубины (количества элементов) стека;
    //  4. Поиск по стеку, при отсутствии искомого значения – исключение;
    //  5. Получение строкового эквивалента элементов стека
    //  представленных в виде массива ([строковое представление элемента1, ..., строковое представление элементаN]).

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        stack.push(25);
        stack.push(20);
        stack.push(15);
        stack.push(10);
        stack.push(5);


        System.out.println(stack.size());
        System.out.println(stack.find(15));
        System.out.println(stack.size());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.size() + ": " + stack);

    }
}
