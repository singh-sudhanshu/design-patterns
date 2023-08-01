package structural.composite;

public class Client {

    public static void main(String[] args) {
        Department fireDepartment = new FireDepartment(1, "fire");
        Department salesDepartment = new SalesDepartment(2, "sales");

        HeadDepartment headDepartment = new HeadDepartment(3, "department");
        headDepartment.addDepartment(fireDepartment);
        headDepartment.addDepartment(salesDepartment);

        headDepartment.printDepartmentName();
    }
}
