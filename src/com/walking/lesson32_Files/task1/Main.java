package com.walking.lesson32_Files.task1;

import com.walking.lesson32_Files.task1.model.Car;
import com.walking.lesson32_Files.task1.model.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // TODO: Задача 1: Используя класс Car (или создав новый класс для сущности «машина», на ваше усмотрение) из задачи
    //  Реализуйте сохранение массива машин в файл carCatalog.txt
    //  Задача 2: Используя Задачу 1, реализуйте чтение из carCatalog.txt, реализовав сохранение данных в массив Car.
    //  Задача 3 (*): Реализуйте возможность добавления, удаления и изменения информации о машинах,
    //  используя Задачи 1 и 2. Работу с файлом предлагаю вынести в класс CarRepository,
    //  но вы можете сделать иную реализацию на свое усмотрение.

    public static void main(String[] args) {


        Car vesta = new Car("Lada", "Vesta", "White");
        Car citroen = new Car("Citroen", "C4", "Brown");

        System.out.println(vesta);

        CarRepository writer = new CarRepository();

        List<Car> cars = new ArrayList<>();
        cars.add(vesta);
        cars.add(citroen);

        writer.writeAll(cars);
        System.out.println(writer.readAll());
        writer.delete(vesta);
        System.out.println(writer.readAll());
    }
}
