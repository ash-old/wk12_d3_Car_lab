import People.Customer;
import People.Dealership;
import Type.Car;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealership dealership;
    Customer customer;
    Car car;
    Vehicle vehicle;

    @Before
    public void before(){
        car = new Car("car");
        vehicle = new Vehicle("Audi", "s8", "Black", 50000, car);
        customer = new Customer("Bobby", 60000);
        dealership = new Dealership("Rusty's Roadsters", 100000);
    }

    @Test
    public void dealershipExists(){
        assertEquals(100000, dealership.getTill());
        assertEquals("Rusty's Roadsters", dealership.getName());
        assertEquals(0, dealership.noOfCarStock());
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.addToVehicleStock(vehicle);
        assertEquals(50000, dealership.getTill());
        assertEquals(1, dealership.noOfCarStock());
    }

}
