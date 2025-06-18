package com.walking.lesson32_Files.task1.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static final String FILE_PATH = "./resources/cars.txt";

    // Считывание всех машин из файла
    public List<Car> readAll() {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Car car = parseCarFromLine(line);
                cars.add(car);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cars;
    }

    // Запись всех машин в файл (перезапись)
    public void writeAll(List<Car> cars) {
        try (FileWriter writer = new FileWriter(FILE_PATH, false)) {
            for (Car car : cars) {
                writer.write(car.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Удаление машины
    public void delete(Car carToDelete) {
        List<Car> cars = readAll();
        cars.removeIf(car -> car.equals(carToDelete)); // equals должен быть реализован
        writeAll(cars);
    }

    // Обновление машины
    public void update(Car targetCar, Car updatedCar) {
        List<Car> cars = readAll();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals(targetCar)) {
                cars.set(i, updatedCar);
                break;
            }
        }
        writeAll(cars);
    }

    private Car parseCarFromLine(String line) {
        // Удаляем обрамление "Car{" и "}"
        line = line.replace("Car{", "").replace("}", "");

        // Разбиваем по запятой
        String[] parts = line.split(", ");

        String brand = parts[0].split("=")[1].replace("'", "");
        String model = parts[1].split("=")[1].replace("'", "");
        String color = parts[2].split("=")[1].replace("'", "");

        return new Car(brand, model, color);
    }
}
