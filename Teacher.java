package compositePatternHW;

public class Teacher extends OrganizationUnit {
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.printf("    Teacher: %s, Subject: %s, Salary: %.2f\n", name, subject, salary);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}