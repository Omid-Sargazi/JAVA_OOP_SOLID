package Projects.AbstractFactoryExample;

public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Render a button in Windows style.");
    }
}
