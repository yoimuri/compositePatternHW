package compositePatternHW;

public abstract class OrganizationUnit {
    protected String name;

    public OrganizationUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
    public abstract int getStudentCount();
    public abstract double getBudget();
}