package Task2;

public class TreatmentPlan {

    int code;

    public TreatmentPlan (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void prescribeDoctor() {
        Clinic doctor;

        if (code == 1) {
            doctor = new Surgeon();
        } else if (code == 2) {
            doctor = new Therapist();
        } else {
            doctor = new Dentist();
        }

        doctor.treat();
    }
}
