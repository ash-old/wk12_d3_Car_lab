package People;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        ownedVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int noOfOwnedVehicles() {
        return ownedVehicles.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        int price = vehicle.getPrice();
        this.money -= price;
        this.ownedVehicles.add(vehicle);

    }

}
