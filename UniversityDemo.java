package compositePatternHW;

public class UniversityDemo {
    public static void main(String[] args) {
        College engineering = new College("College of Engineering");
        College business = new College("College of Business");
        College university = new College("New Era University");

        Department cs = new Department("Computer Science Dept");
        Department it = new Department("Information Technology Dept");

        Teacher t1 = new Teacher("Jeremiah", "Algorithms", 90000);
        Teacher t2 = new Teacher("Mark", "Data Structures", 80000);
        Teacher t3 = new Teacher("Lorenz", "Marketing", 80000);

        Student s1 = new Student("Clint", "21-243123-17", 25000);
        Student s2 = new Student("Branwel", "22-745574-54", 25000);
        Student s3 = new Student("Poyaoan", "19-1232716-5", 20000);
        Student s4 = new Student("Alejandro","M0723612", 100000);
        
        cs.add(t1);
        cs.add(s1);
        cs.add(s2);
        cs.add(s4);
        
        it.add(t2);
        it.add(s3);

        engineering.add(cs);
        engineering.add(it);
        engineering.add(t3);

        business.add(t3);
        business.add(s3);

        university.add(engineering);
        university.add(business);

        System.out.println("=== NEU ===");
        university.displayDetails();

        System.out.println("Total students in University: " + university.getStudentCount());

        System.out.printf("Total budget of University: %.2f", university.getBudget());
    }
}