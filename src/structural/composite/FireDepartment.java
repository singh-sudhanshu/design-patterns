package structural.composite;

/**
 * Leaf elements. They should implement base class methods
 */
public class FireDepartment extends Department {

    public FireDepartment(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName() + " " + this.getName());
    }
}
