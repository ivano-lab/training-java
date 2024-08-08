package academy.devdojo.maratonajava.comportamentos.teste;

import academy.devdojo.maratonajava.comportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {

    private static List<Car> cars = List.of(new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2023));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByYear(cars, 2019));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> redCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getColor().equals("red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> colorCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getColor().equals(cor)) {
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}



