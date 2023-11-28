package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>() {{
        add(new Car("Tesla", 2021, 40000));
        add(new Car("Toyota", 2001, 2000));
        add(new Car("BMW", 1992, 2500));
        add(new Car("Lexus", 2022, 60500));
        add(new Car("Mercedes", 1999, 3000));
    }};

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
