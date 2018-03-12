package Kaijus;

public class LandKaiju extends Kaiju implements IMove {

    public LandKaiju(String name, int healthValue, int Attackvalue) {
        super(name, healthValue, Attackvalue);
    }

    public String move() {
        return "Walking ...";
    }

}
