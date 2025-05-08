package com.walking.lesson14_Polymorphism.RightFigure.Figure;

import com.walking.lesson14_Polymorphism.RightFigure.RightFigure;

public class Triangle extends RightFigure {
    @Override
    public void draw(int side) {
        super.draw(side);
        drawSides(side);
        drawBase(side);
    }

    private void drawSides(int height) {
        if (height < 2) {
            System.out.println("Высота должна быть не менее 2.");
            return;
        }

        // Вершина
        for (int j = 0; j < height - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(RIGHT_LINE + LEFT_LINE);

        // Боковые стороны
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print(RIGHT_LINE);

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            System.out.println(LEFT_LINE);
        }
    }

    private void drawBase(int side) {
        for (int i = 0; i < side * 2; i++) {
            System.out.print(UP_AND_DOWN_LINE);
        }
    }
}
