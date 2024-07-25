public abstract class HospitalManager {
    public abstract MedicalStaff createStaff(String type);

    public void manage() {
        MedicalStaff doctor = createStaff("doctor");
        doctor.performDuty();

        MedicalStaff nurse = createStaff("nurse");
        nurse.performDuty();
    }
}