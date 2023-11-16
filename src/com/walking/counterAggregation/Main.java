package com.walking.counterAggregation;
import com.walking.counterAggregation.counter.Counter;
import com.walking.counterAggregation.service.CounterService;

public class Main {
    public static void main(String[] args) {
        Counter hotWater = new Counter("Горячая вода", "м^3");
        Counter coldWater = new Counter("Холодная вода", "м^3");
        Counter gas = new Counter("Газ", "м^3");
        Counter electricity = new Counter("Электричество", "кВт/ч");
        hotWater.setReadings(25.2);
        coldWater.setReadings(318);
        electricity.setReadings(21547);
        gas.setReadings(36);

        CounterService service = new CounterService();
        service.getAllCounters();

        System.out.println(hotWater.getReadings());
        service.incrementReading("Горячая вода");
        System.out.println(hotWater.getReadings());
        service.resetCounter("Горячая вод");
        System.out.println(hotWater.getReadings());
    }

}
