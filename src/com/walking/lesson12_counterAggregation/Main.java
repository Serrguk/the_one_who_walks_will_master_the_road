package com.walking.lesson12_counterAggregation;

public class Main {

    //TODO: Разработать программу в рамках компании walking/com, позволяющую следить за счетчиками на газ,
    // холодную воду, горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
    // Используя за основу задачу из темы про классы и объекты, реализовать класс счетчика,
    // который хранит название счетчика и его значение, его единицы измерения, а также обеспечивает доступ к значениям.
    // Название счетчика и его единицы измерения должны быть неизменны.Также реализовать сервис CounterService,
    // зона ответственности которого — хранение массива доступных счетчиков, получение всех доступных счетчиков,
    // получение доступа к счетчику по названию, увеличение значения счетчика на единицу или заданное значение,
    // а также сброс счетчика до нулевого значения.
    // Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
    // Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков

    public static void main(String[] args) {
        Counter counter = new Counter("Электросчётчик", 0.0, Unit.KILOWATT_HOUR);
        System.out.printf("%s, показания: %.2f %s", counter.getName(), counter.getValue(), counter.getUnit());

        counter.setValue(9.5);

        System.out.printf("\n%s, показания: %.2f %s\n", counter.getName(), counter.getValue(), counter.getUnit());

        CounterService counters = new CounterService();
        counters.addMeter(counter);
        counters.increment(counter.getName());
        System.out.println(counter.getValue());
        counters.increment(counter.getName(), 4.5);
        System.out.println(counter.getValue());

        Counter counter1 = new Counter("Счётчик холодной воды", 0.0, Unit.CUBIC_METER);
        counters.addMeter(counter1);

        int count = 1;
        for (Counter counter2 :counters.getAllMeters()) {
            System.out.println(count + ": " +  counter2.getName());
            count++;
        }

        counters.reset("Электросчётчик");

        System.out.println(counter.getValue());

    }
}
