package Type;

import Components.Engine;
import Components.Tyres;

public class Car extends Type {

    private Tyres tyres;
    private Engine engine;


    public Car(String type) {
        super(type);
        this.tyres = new Tyres("racing", 4);
        this.engine = new Engine("racing engine");
    }

    public int getTyreAmount() {
        return tyres.getNoOfTyres();
    }

    public String getTyreName() {
        return tyres.getName();
    }

    public String getEngine() {
        return engine.getName();
    }
}
