package Projects.AbstractFactoryExample;

public class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a checkbox in Windows style.");
    }
}
