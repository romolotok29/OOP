package Task2;

public class Dentist implements Clinic{
    @Override
    public void treat() {
        System.out.println("Hello, i am a dentist. Lets drill your teeth!");
    }
}
