package Task2;

public class Patient {

    TreatmentPlan treatmentPlan;

    public Patient (TreatmentPlan treatmentPlan) {

        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }
}
