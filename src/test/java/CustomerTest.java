import People.Customer;
import Type.Car;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Vehicle vehicle;

    @Before
    public void before(){
        customer = new Customer("Bobby", 60000);
        car = new Car("car");
        vehicle = new Vehicle("Audi", "s8", "Black", 50000, car);
    }

    @Test
    public void customerExists(){
        assertEquals("Bobby", customer.getName());
        assertEquals(60000, customer.getMoney());
        assertEquals(0, customer.noOfOwnedVehicles());
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(vehicle);
        assertEquals(10000, customer.getMoney());
        assertEquals(1, customer.noOfOwnedVehicles());
    }
}
