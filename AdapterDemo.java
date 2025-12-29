// Target Interface
interface Charger {
    void chargePhone();
}

// Adaptee (Existing class)
class OldCharger {
    void chargeWithPin() {
        System.out.println("Charging phone using old charger");
    }
}

// Adapter Class
class ChargerAdapter implements Charger {

    OldCharger oldCharger;

    // Constructor
    ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    // Adapter method
    public void chargePhone() {
        oldCharger.chargeWithPin();  // Adapting old method
    }
}

// Client / Main Class
public class AdapterDemo {
    public static void main(String[] args) {

        OldCharger oldCharger = new OldCharger();     // Old system
        Charger charger = new ChargerAdapter(oldCharger); // Adapter

        charger.chargePhone(); // Client uses new interface
    }
}
