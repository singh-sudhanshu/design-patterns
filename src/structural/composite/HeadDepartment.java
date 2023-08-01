package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment extends Department {

    private final List<Department> departments;

    public HeadDepartment(Integer id, String name) {
        super(id, name);
        departments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
