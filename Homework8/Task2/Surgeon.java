package Task2;

public class Surgeon implements Clinic {
    @Override
    public void treat() {
        System.out.println("Hello, i am surgeon. Lets operate on you!");
    }
}
