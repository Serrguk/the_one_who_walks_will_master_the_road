package com.walking.lesson19_ObjectMethods;

import com.walking.lesson19_ObjectMethods.Models.BaseOfCars;
import com.walking.lesson19_ObjectMethods.Models.Car;
import com.walking.lesson19_ObjectMethods.Models.CarBrand;
import com.walking.lesson19_ObjectMethods.Models.CarColor;

public class Main {
    public static void main(String[] args) {

        // TODO: Реализуйте класс Машина. Поля допустимо выбрать на свое усмотрение, но необходимо,
        //  чтобы по ним можно было однозначно идентифицировать каждую машину. Скажем, в рамках базы ГАИ.
        //  Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
        //  Данные для проверки необходимо запрашивать с клавиатуры.
        //  Если машина найдена — выведите ее строковое представление в консоль.
        //  Опциональное усложнение: номер машины может быть не уникальным.

        Car zeekrR1 = new Car(CarBrand.ZEEKR, CarColor.ORANGE, "FUCKOFF");
        Car crown = new Car(CarBrand.TOYOTA, CarColor.RED, "K251TY19RUS");

        System.out.println(zeekrR1);
        System.out.println(zeekrR1.getCarBrand());

        BaseOfCars baseOfCars = new BaseOfCars();
        baseOfCars.add(zeekrR1);
        baseOfCars.add(crown);

        System.out.println();

        baseOfCars.printAllCar();
    }
}
