package Type;

import Components.Motor;
import Components.Tyres;

public class ElectricCar extends Type{

    private Motor motor;
    private Tyres tyres;

    public ElectricCar(String type, Motor motor, Tyres tyres) {
        super(type);
        this.motor = new Motor("super-slow motor");
        this.tyres = new Tyres("super-slow", 4);
    }
}
