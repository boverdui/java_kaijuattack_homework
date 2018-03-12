package Kaijus;

public class WaterKaiju extends Kaiju implements IMove {

    public WaterKaiju(String name, int healthValue, int Attackvalue) {
        super(name, healthValue, Attackvalue);
    }

    public String move() {
        return "Swimming ...";
    };

}
