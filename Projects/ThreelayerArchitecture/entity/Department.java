package Projects.ThreelayerArchitecture.entity;

import java.util.List;

public class Department {
    private String name;
    private List<Doctor> doctors; // Aggregation
    private Hospital hospital; // Composition

    public Department(String name, List<Doctor> doctors, Hospital hospital) {
        this.name = name;
        this.doctors = doctors;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void showDetails() {
        System.out.println("Department [Name=" + name + "]");
        for (Doctor doctor : doctors) {
            doctor.showDetails();
        }
    }
}
