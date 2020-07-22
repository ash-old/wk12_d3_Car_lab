package Vehicle;

import Components.Components;
import Type.Type;

import java.util.ArrayList;

public class Vehicle {

    private String make;
    private String model;
    private String colour;
    private int price;
    private Type type;


    public Vehicle(String make, String model, String colour, int price, Type type) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }
}
