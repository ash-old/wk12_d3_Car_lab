package People;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> vehicleStock;
    private int till;

    public Dealership(String name, int till) {
        this.name = name;
        this.till = till;
        vehicleStock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public int noOfCarStock() {
        return vehicleStock.size();
    }

    public int getTill() {
        return till;
    }

    public void addToVehicleStock(Vehicle vehicle) {
        this.till -= vehicle.getPrice();
        this.vehicleStock.add(vehicle);
    }

    public void sellVehicleToCustomer(Customer customer, Vehicle vehicle){
        customer.buyVehicle(vehicle);
        this.till += vehicle.getPrice();
        this.vehicleStock.remove(vehicle);
    }

    public void setTill(int till) {
        this.till = till;
    }
}
