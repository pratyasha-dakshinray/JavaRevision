package pojo;

public class DataTransferUsingSetNGetTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1);

        Employee employee2 = new Employee(1);
        System.out.println(employee2);

        Employee employee3 = new Employee(1, "Pratyasha");
        System.out.println(employee3);

        Employee employee4 = new Employee(1, "Pratyasha");
        System.out.println(employee4);

        Employee employee5 = new Employee();

        employee5.setEmployeeId(5);
        employee5.setEmployeeName("Pratyasha");
        employee5.setEmployeeAge(23);
        employee5.setEmployeeEmail("pratyasha@gmail.com");
        employee5.setEmployeeMobileNo(9876543210L);
        employee5.setEmployeeDob("10-05-2002");
        employee5.setEmployeeSalary(25000.0f);
        employee5.setEmployeeDoj("10-01-2025");
        employee5.setEmployeeDepartment("IT");
        employee5.setEmployeeAddress("Bhubaneswar");
        employee5.setEmployeeSkills(new String[]{"Java", "SQL"});

        System.out.println(employee5);


        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student(1);
        System.out.println(student2);

        Student student3 = new Student(1, "Pratyasha");
        System.out.println(student3);

        Student student4 = new Student(
                1,
                101,
                "Pratyasha",
                23,
                "pratyasha@gmail.com",
                9876543210L,
                "10-05-2002",
                85.5f,
                "10-01-2025",
                "Parent Name",
                "Bhubaneswar",
                new String[]{"Java", "SQL", "Python"}
        );

        System.out.println(student4);

        Student student5 = createStudent5();

        System.out.println(student5);

        employee5.setEmployeeId(student5.getStudentId());
        employee5.setEmployeeName(student5.getStudentName());
        employee5.setEmployeeAge(student5.getStudentAge());
        employee5.setEmployeeEmail(student5.getStudentEmail());
        employee5.setEmployeeMobileNo(student5.getStudentMobileNo());
        employee5.setEmployeeDob(student5.getStudentDob());
        employee5.setEmployeeDoj(student5.getStudentDoj());
        employee5.setEmployeeAddress(student5.getStudentAddress());

        System.out.println("Employee data after Student data transfer:");
        System.out.println(employee5);

    }

    private static Student createStudent5() {
        Student student5 = new Student();

        student5.setStudentId(5);
        student5.setStudentRollNo(105);
        student5.setStudentName("Pratyasha");
        student5.setStudentAge(23);
        student5.setStudentEmail("pratyasha@gmail.com");
        student5.setStudentMobileNo(9876543210L);
        student5.setStudentDob("10-05-2002");
        student5.setStudentMarks(90.5f);
        student5.setStudentDoj("10-01-2025");
        student5.setStudentParentName("Parent Name");
        student5.setStudentAddress("Bhubaneswar");
        student5.setStudentCourse(new String[]{"Java", "SQL", "Python"});
        return student5;
    }
}
