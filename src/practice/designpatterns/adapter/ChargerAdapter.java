package practice.designpatterns.adapter;

public class ChargerAdapter implements USBCCharger{

    private MicroUSBCharger microUSBCharger ;
    public ChargerAdapter(MicroUSBCharger microUSBCharger){
        this.microUSBCharger = microUSBCharger;
    }
    @Override
    public void chargePhone() {
        microUSBCharger.chargeUsingMicroUSB();
    }
}
