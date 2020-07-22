package People;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> carStock;
    private int till;

    public Dealership(String name, int till) {
        this.name = name;
        this.till = till;
        carStock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getCarStock() {
        return carStock;
    }

    public int getTill() {
        return till;
    }

    public void setCarStock(ArrayList<Vehicle> carStock) {
        this.carStock = carStock;
    }

    public void setTill(int till) {
        this.till = till;
    }
}
