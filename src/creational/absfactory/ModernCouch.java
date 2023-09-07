package creational.absfactory;

public class ModernCouch implements Couch {

    @Override
    public void assembleCouch() {
        System.out.println("Modern couch being built");
    }

    @Override
    public String toString() {
        return "ModernCouch";
    }
}
