import Task1.Phone;
import Task2.Patient;
import Task2.TreatmentPlan;

import static Task1.Phone.sendMessage;

public class Main {
    public static void main(String[] args) {

        //Task1 check

        Phone phone = new Phone("+371 27889027", "Samsung", 190.5f);

        phone.receiveCall("Ivan");
        System.out.println(phone.getNumber());
        phone.receiveCall("Pavel", "+371 25470228");
        sendMessage("+371 27889027", "+371 24238222");

        System.out.println();

        //Task2 check

        Patient patient = new Patient(new TreatmentPlan(2));
        patient.getTreatmentPlan().prescribeDoctor();




    }
}