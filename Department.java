package compositePatternHW;
import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationUnit {
    private List<OrganizationUnit> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(OrganizationUnit unit) {
        children.add(unit);
    }

    public void remove(OrganizationUnit unit) {
        children.remove(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (OrganizationUnit unit : children) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (OrganizationUnit unit : children) {
            total += unit.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double sum = 0.0;
        for (OrganizationUnit unit : children) {
            sum += unit.getBudget();
        }
        return sum;
    }
}