package compositePatternHW;

public class Student extends OrganizationUnit {
    private String studentId;
    private double tuition;

    public Student(String name, String studentId, double tuition) {
        super(name);
        this.studentId = studentId;
        this.tuition = tuition;
    }

    @Override
    public void displayDetails() {
        System.out.printf("    Student: %s, ID: %s, Tuition: %.2f\n", name, studentId, tuition);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuition;
    }
}
