package Projects.ThreelayerArchitecture.entity;

public class Patient extends Person {
    private String illness;

    public Patient(String id, String name, int age, String illness) {
        super(id, name, age);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Patient [ID=" + getId() + ", Name=" + getName() + ", Age=" + getAge() + ", Illness=" + illness + "]");
    }
}
