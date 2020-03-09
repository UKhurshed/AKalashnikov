package Classes;

import Abstracts.Gun;
import Interfaces.GunInformation;

public class AKalashnikov extends Gun implements GunInformation {

    private String color;
    private String model;

    public AKalashnikov(double weight, double caliber, int initialSpeed, int holder, String color, String model) {
        super(weight, caliber, initialSpeed, holder);
        this.color = color;
        this.model = model;
    }

    @Override
    public void singleFire() {
        int count = getHolder();
        if(count>0){
            count--;
            setHolder(count);
            System.out.println("BooooooM");
            System.out.println("Left: " + count + " bullets");
        }
        else{
            System.out.println("The holder is empty");
        }

    }

    @Override
    public void autoFire() {
        int count = getHolder();
        if(count>=5){
            count-=5;
            setHolder(count);
            System.out.println("BooooooM-BooooooM");
            System.out.println("Left: " + count + " bullets");
        }
        else{
            System.out.println("The holder is empty");
        }
    }

    //implemented method
    @Override
    public void info() {
        System.out.println("-----------Information-------------");
        System.out.println("Abstracts.Gun model: " + getModel() + "\n" + "Abstracts.Gun weight: " + getWeight() + " kg" + "\n"
                + "Abstracts.Gun caliber: " + getCaliber() + " mm" + "\n" + "Muzzle velocity: " + getInitialSpeed() + " km/h" + "\n"
                + "Count of bullets in the holder: " + getHolder() + " pieces" + "\n" + "Abstracts.Gun color: " + getColor() + "\n");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
