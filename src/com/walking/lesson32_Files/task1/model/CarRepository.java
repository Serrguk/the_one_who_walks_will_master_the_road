package com.walking.lesson32_Files.task1.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CarRepository {
    public static final String FILE_PATH = ".\\resources\\cars.txt";

    File cars = new File(FILE_PATH);

    public void write(Car car) {
        try (FileWriter writer = new FileWriter(cars, true)){
            writer.write(car.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Здесь реализовать логику записи класса Car в файл, чтение и изменение
}
