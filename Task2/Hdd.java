package Task2;

public class Hdd {
    String name;
    int volume;
    String type;

    public Hdd () {};

    public Hdd (String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void info () {
        System.out.println("HDD name : " + name);
        System.out.println("HDD volume : " + volume);
        System.out.println("HDD type : " + type);
    }
}
