package com.walking.lesson14_Polymorphism.RightFigure.Figure;

import com.walking.lesson14_Polymorphism.RightFigure.RightFigure;

public class Square extends RightFigure {
    @Override
    public void draw(int side) {
        super.draw(side);

        drawBorder(side);
        drawSideWalls(side);
        drawBorder(side);
    }

    private void drawBorder(int side) {
        System.out.print(" ");
        for (int i = 0; i < side * 2; i++) {
            System.out.print(UP_AND_DOWN_LINE);
        }
        System.out.println();
    }

    private void drawSideWalls(int side) {
        String line = VERTICAL_LINE;
        for (int i = 0; i < side * 2; i++) {
            line = line.concat(" ");
        }
        line = line.concat(VERTICAL_LINE);

        for (int i = 0; i < side; i++) {
            System.out.println(line);
        }
    }
}
