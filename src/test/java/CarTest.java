import Type.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("car");
    }


    @Test
    public void isCar(){
        assertEquals(4, car.getTyreAmount());
        assertEquals("racing", car.getTyreName());
        assertEquals("racing engine", car.getEngine());
    }


}
