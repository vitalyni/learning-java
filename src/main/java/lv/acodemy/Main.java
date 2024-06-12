package lv.acodemy;

import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args) {

        // How to create object?

        Car myFirstCar = new Car();

        // How to print object?
        System.out.println(myFirstCar);

        // Set carBrand
        myFirstCar.setCarBrand("Audi");
        System.out.println(myFirstCar);

        // Set all other fields
        myFirstCar.setModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Race blue");
        System.out.println(myFirstCar);

        // Task: Create a new object car, set all fields and print object out;
        Car mySecondCar = new Car();
        mySecondCar.setCarBrand("Volkswagen");
        mySecondCar.setModel("Arteon");
        mySecondCar.setProductionYear(2023);
        mySecondCar.setMileage(17548);
        mySecondCar.setColor("Black");
        System.out.println(mySecondCar);


        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Superb")
                .setProductionYear(2021)
                .setMileage(153340)
                .setColor("White")
                .build();

        System.out.println(mySkoda);

        mySkoda.start();
        mySkoda.drive(1_000);

        Cat fedya = new Cat("Fedya", "Male", 1, "British longhair", "Grey");
        System.out.println(fedya);
        fedya.setCatAge(1);
        fedya.sleep();
        fedya.walk();
    }
}