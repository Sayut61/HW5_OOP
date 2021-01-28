package Tasc4;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "manufacturer=" + getManufacturer() +
                ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() +
                ", X=" + getResolutionX() + ", Y=" + getResolutionY();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == this.getClass()){
            Monitor device = (Monitor) obj;
            boolean res1 = device.manufacturer == this.manufacturer;
            boolean res2 = device.price == this.price;
            boolean res3 = device.serialNumber == this.serialNumber;
            boolean res4 = device.resolutionX == this.resolutionX;
            boolean res5 = device.resolutionY == this.resolutionY;
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
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;

        return result;
    }
}
