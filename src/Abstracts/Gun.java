package Abstracts;

public abstract class Gun {

    private int holder = 30;

    public Gun(int holder){
        this.holder = holder;
    }

    public abstract void fire();

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }
}
