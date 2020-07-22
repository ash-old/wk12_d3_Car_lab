package Type;

import Components.Engine;
import Components.Motor;
import Components.Tyres;

public class HybridCar extends Type{

    private Motor motor;
    private Engine engine;
    private Tyres tyres;

    public HybridCar(String type, Motor motor, Engine engine, Tyres tyres) {
        super(type);
        this.motor = new Motor("slow motor");
        this.engine = new Engine("slow engine");
        this.tyres = new Tyres("slow", 4);
    }
}
