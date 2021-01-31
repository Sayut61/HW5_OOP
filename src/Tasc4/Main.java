package Tasc4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024 );
        EthernetAdapter ethernetAdapter = new EthernetAdapter("TP-Link", 120, "12341", 100, "211314");
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("TP-Link", 120, "12341", 100, "211314");
        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.equals(ethernetAdapter1));
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(ethernetAdapter1.hashCode());

    }
}
