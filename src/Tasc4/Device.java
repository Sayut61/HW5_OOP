package Tasc4;

import java.util.Objects;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacturer=" + getManufacturer() +
                ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == this.getClass()){
            Device device = (Device) obj;
            boolean res1 = device.manufacturer == this.manufacturer;
            boolean res2 = device.price == this.price;
            boolean res3 = device.serialNumber == this.serialNumber;
            return res1 && res2 && res3;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 37 * result + Float.floatToRawIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
