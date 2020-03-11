package Classes;

import Abstracts.Gun;

public class AKalashnikov extends Gun {

    private String model;
    private boolean singleFire = false;
    private boolean autoFire = false;


    public AKalashnikov(int holder, String model) {
        super(holder);
        this.model = model;
    }


    @Override
    public void fire() {
        int count = getHolder();
        if (count <= 0){
            System.out.println("The holder is empty");
        }
        else if (isSingleFire()){
            setHolder(--count);
            System.out.println("Left: " + getHolder() + "\n");
        }
        else if (isAutoFire()){
            if(count<=5){
                setHolder(0);
                System.out.println("Used all of bullets: " + getHolder());
            }
            else if (count>5){
                count-=5;
                setHolder(count);
                System.out.println("Left: " + getHolder() + "\n");
            }
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSingleFire() {
        return singleFire;
    }

    public void setSingleFire(boolean singleFire) {
        if(singleFire){
            setAutoFire(false);
            System.out.println("Turn on Singe Fire option");
        }
        this.singleFire = singleFire;
    }

    public boolean isAutoFire() {
        return autoFire;
    }

    public void setAutoFire(boolean autoFire) {
        if(autoFire) {
            setSingleFire(false);
            System.out.println("Turn on Auto Fire option");
        }
        this.autoFire = autoFire;
    }

    public int getFuel(int countOfBullets){
        System.out.println("Fill up: " + countOfBullets + " bullets" + "\n");
        setHolder(countOfBullets);
        return getHolder();
    }

}
