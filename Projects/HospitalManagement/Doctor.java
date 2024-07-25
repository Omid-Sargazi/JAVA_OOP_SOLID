package Projects.HospitalManagement;

public class Doctor implements MedicalStaff {
    @Override
    public void performDuty() {
        System.out.println("Doctor is treating patients.");
    }
}
