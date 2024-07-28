package Projects.ThreelayerArchitecture.entity;

import java.util.List;

public class Hospital {
    private String name;
    private List<Department> departments;

    public Hospital(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void showDetails() {
        System.out.println("Hospital [Name=" + name + "]");
        for (Department department : departments) {
            department.showDetails();
        }
    }
}