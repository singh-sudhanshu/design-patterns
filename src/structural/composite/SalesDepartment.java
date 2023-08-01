package structural.composite;

/**
 * Leaf elements. They should implement base class methods
 */
public class SalesDepartment extends Department {

    public SalesDepartment(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
