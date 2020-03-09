import Classes.AKalashnikov;

public class Main {
    public static void main(String[] args) {
        AKalashnikov ak47 = new AKalashnikov(4.3, 7.62, 700, 6, "yellow", "AK-47");
        ak47.info();
        ak47.singleFire();
        ak47.autoFire();
        ak47.singleFire();
        ak47.autoFire();

        AKalashnikov ak74 = new AKalashnikov(3.3,5.45,910,30,"black","AK-74");
        ak74.info();
        ak74.singleFire();
        ak74.autoFire();
        ak74.singleFire();

    }
}
