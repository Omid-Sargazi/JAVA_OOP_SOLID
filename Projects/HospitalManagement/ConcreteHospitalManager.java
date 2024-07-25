package Projects.HospitalManagement;

public class ConcreteHospitalManager extends HospitalManager {
    @Override
    public MedicalStaff createStaff(String type) {
        switch (type.toLowerCase()) {
            case "doctor":
                return new Doctor();
            case "nurse":
                return new Nurse();
            default:
                throw new IllegalArgumentException("Unknown staff type");
        }
    }
}
