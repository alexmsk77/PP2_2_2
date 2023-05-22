package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    public List<Car> getCarListOnCount(Integer countCars) {
        return carDao.getCarListOnCount(countCars);
    }
}