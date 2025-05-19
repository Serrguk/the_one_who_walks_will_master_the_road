package com.walking.lesson19_ObjectMethods;

import com.walking.lesson19_ObjectMethods.Models.BaseOfCars;
import com.walking.lesson19_ObjectMethods.Models.Car;
import com.walking.lesson19_ObjectMethods.Models.CarBrand;
import com.walking.lesson19_ObjectMethods.Models.CarColor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: Реализуйте класс Машина. Поля допустимо выбрать на свое усмотрение, но необходимо,
        //  чтобы по ним можно было однозначно идентифицировать каждую машину. Скажем, в рамках базы ГАИ.
        //  Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
        //  Данные для проверки необходимо запрашивать с клавиатуры.
        //  Если машина найдена — выведите ее строковое представление в консоль.
        //  Опциональное усложнение: номер машины может быть не уникальным.

        Car r1 = new Car(CarBrand.ZEEKR, CarColor.ORANGE, "FUCKOFF");
        Car crown = new Car(CarBrand.TOYOTA, CarColor.RED, "K251TY19RUS");
        Car note = new Car(CarBrand.NISSAN, CarColor.BLUE, "A315KO19RUS");
        Car laurel = new Car(CarBrand.NISSAN, CarColor.BLACK, "K251TY19RUS");
        Car stepwgn = new Car(CarBrand.HONDA, CarColor.BROWN, "WAGON");
        Car vesta = new Car(CarBrand.LADA, CarColor.WHITE, "H937KO19RUS");
        Car demio = new Car(CarBrand.MAZDA, CarColor.GREEN, "TABURET");

        System.out.println(r1);
        System.out.println(r1.getCarBrand());

        BaseOfCars baseOfCars = new BaseOfCars();
        baseOfCars.add(r1);
        baseOfCars.add(crown);
        baseOfCars.add(note);
        baseOfCars.add(laurel);
        baseOfCars.add(stepwgn);
        baseOfCars.add(vesta);
        baseOfCars.add(demio);

        baseOfCars.printAllCar();
        System.out.println("printAllCar выше");
        System.out.println(Arrays.toString(baseOfCars.getCars()));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поисковый запрос: ");
        String input = scanner.nextLine();

        baseOfCars.search(input);
    }
}
