package Components;

public class Tyres extends Components{

    private int noOfTyres;

    public Tyres(String name, int noOfTyres) {
        super(name);
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }
}
