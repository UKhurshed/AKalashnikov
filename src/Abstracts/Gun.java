package Abstracts;

public abstract class Gun {

    private double weight;
    private double caliber;
    private int initialSpeed;
    private int holder = 30;

    public Gun(double weight, double caliber, int initialSpeed, int holder){
        this.weight = weight;
        this.caliber = caliber;
        this.initialSpeed = initialSpeed;
        this.holder = holder;
    }

    public abstract void singleFire();
    public abstract void autoFire();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public int getInitialSpeed() {
        return initialSpeed;
    }

    public void setInitialSpeed(int initialSpeed) {
        this.initialSpeed = initialSpeed;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }
}
