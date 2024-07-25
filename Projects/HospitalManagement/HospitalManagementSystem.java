package Projects.HospitalManagement;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        HospitalManager manager = new ConcreteHospitalManager();
        manager.manage();
    }
}
