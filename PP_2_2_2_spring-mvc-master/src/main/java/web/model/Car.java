package web.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private String color;
    private int power;

    public Car(){};

    public Car(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setHorsePower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model '" + model + '\'' +
                ", color '" + color + '\'' +
                ", power " + power +
                '.';
    }
}