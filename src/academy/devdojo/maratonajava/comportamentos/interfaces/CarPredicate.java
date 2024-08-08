package academy.devdojo.maratonajava.comportamentos.interfaces;

import academy.devdojo.maratonajava.comportamentos.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
