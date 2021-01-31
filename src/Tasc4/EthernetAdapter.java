package Tasc4;

import java.util.Objects;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == this.getClass()){
            EthernetAdapter device = (EthernetAdapter) obj;
            boolean res1 = device.manufacturer == this.manufacturer;
            boolean res2 = device.price == this.price;
            boolean res3 = device.serialNumber == this.serialNumber;
            boolean res4 = device.speed == this.speed;
            boolean res5 = device.mac == this.mac;
            return res1 && res2 && res3 && res4 && res5;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 37 * result + Float.floatToRawIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 37 * result + speed;
        result = 37 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
