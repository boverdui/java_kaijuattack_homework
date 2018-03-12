package Kaijus;

public class AirKaiju extends Kaiju implements IMove {

    public AirKaiju(String name, int healthValue, int Attackvalue) {
        super(name, healthValue, Attackvalue);
    }

    public String move() {
        return "Flying ...";
    }

}
