import Classes.AKalashnikov;

public class Main {
    public static void main(String[] args) {
        AKalashnikov ak47 = new AKalashnikov( 2, "AK-47");

        ak47.setSingleFire(true);
        ak47.fire();
        ak47.getFuel(15);
        ak47.setAutoFire(true);
        ak47.fire();
    }
}
