package Projects.ThreelayerArchitecture.entity;

public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients; // Association

    public Doctor(String id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor [ID=" + getId() + ", Name=" + getName() + ", Age=" + getAge() + ", Specialization="
                + specialization + "]");
    }
}
