package com.walking.lesson14_Polymorphism;

import com.walking.lesson14_Polymorphism.RightFigure.Figure.Square;
import com.walking.lesson14_Polymorphism.RightFigure.RightFigure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: Реализуйте класс «Правильная фигура». Для него создайте классы-наследники Треугольник и Квадрат.
        //  Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
        //  Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.

        System.out.println("Введите название фигуры и длину стороны через пробел: ");
        Scanner scanner = new Scanner(System.in);

        //String input = scanner.nextLine();
        String input = "квадрат 5";
        String[] data = input.split(" ");

        String figure = data[0];
        int side = Integer.parseInt(data[1]);

        switch (figure.toLowerCase()) {
            case "квадрат" -> {
                RightFigure square = new Square();
                square.draw(side);
            }
        }
    }
}
