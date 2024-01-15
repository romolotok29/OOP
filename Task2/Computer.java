package Task2;

public class Computer {
    double price;
    String model;
    int ram;
    int hdd;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer (float price, String model, int ram, int hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void info () {
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
        System.out.println("RAM : " + ram);
        System.out.println("HDD : " + hdd);
    }
}
