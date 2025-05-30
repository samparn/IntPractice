package practice.designpatterns.adapter;

public class App {
    public static void main(String[] args) {
        MicroUSBCharger microUSBCharger = new MicroUSBCharger();
        USBCCharger charger = new ChargerAdapter(microUSBCharger);
        charger.chargePhone();
    }
}
/*
✔ WHEN to use:
   - When two classes have incompatible interfaces but you need to use them together
   - When integrating legacy code with new systems
   - When you want to use a third-party API in your standard interface

✔ WHERE to use:
   - UI frameworks adapting different widget interfaces
   - Payment gateway wrappers (e.g., adapting PayPal to your common payment interface)
   - Legacy system adapters (e.g., old DB systems with new code)
   - File format converters (e.g., XML to JSON adapters)
*/
