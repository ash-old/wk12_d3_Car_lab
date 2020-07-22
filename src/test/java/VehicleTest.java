import Type.Car;
import Type.Type;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Type car;

    @Before
    public void before(){
        car = new Car("car");
        vehicle = new Vehicle("Audi", "s8", "Black", 50000, car);
    }

    @Test
    public void isVehicle(){
        assertEquals("Audi", vehicle.getMake());
        assertEquals("s8", vehicle.getModel());
        assertEquals("Black", vehicle.getColour());
        assertEquals(50000, vehicle.getPrice());
        assertEquals(car, vehicle.getType());

    }

}
