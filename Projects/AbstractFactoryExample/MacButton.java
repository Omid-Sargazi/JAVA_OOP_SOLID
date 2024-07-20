package Projects.AbstractFactoryExample;

class MacButton implements Button {
    public void paint() {
        System.out.println("Render a button in Mac style.");
    }
}