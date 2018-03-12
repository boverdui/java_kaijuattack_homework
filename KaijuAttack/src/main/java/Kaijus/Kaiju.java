package Kaijus;

import Vehicles.Vehicle;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }


    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public String roar() {
        return "Rrrrrrroooooooaaaaaaarrrrrrr!!!!!!!";
    }

    public void attack(Vehicle vehicle) {
        vehicle.takeDamage(this.attackValue);
    }

}
