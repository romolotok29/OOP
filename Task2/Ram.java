package Task2;

public class Ram {
    String name;
    int volume;

    public Ram (){};

    public Ram (String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void info () {
        System.out.println("RAM name : " + name);
        System.out.println("RAM volume : " + volume);
    }
}
