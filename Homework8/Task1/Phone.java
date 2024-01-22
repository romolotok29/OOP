package Task1;

public class Phone {

    String number;
    String model;
    float weight;

    public Phone (String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone () {};

    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    };

    public void receiveCall (String name, String number) {
        System.out.println("Звонит " + name + ", Номер телефона : " + number);
    };

    public String getNumber () {
        return number;
    };

    public static void sendMessage (String... numbers) {

        for (String number : numbers) {
            System.out.println("Добрый день, " + number + "!" + " Не забудьте забрать посылку до 29.01.2024!");
        }
    }
}
