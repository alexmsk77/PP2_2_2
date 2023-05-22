package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    private static List<Car> carList;
    static {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "black", 350));
        carList.add(new Car("AUDI", "white", 150));
        carList.add(new Car("OPEL", "red", 140));
        carList.add(new Car("MAZDA", "yellow", 105));
        carList.add(new Car("PAGANI", "brown", 1001));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public List<Car> getCarListOnCount(Integer countCars) {
        List<Car> list = getCars();
        if (countCars == null || countCars < 0 || countCars > list.size()) {
            countCars = list.size();
        }
        return list.stream().limit(countCars).toList();
    }
}