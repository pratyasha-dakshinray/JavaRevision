package testclass;

public class StudentsTest {
    public static void main(String[] args) {
        Student students =  new Student();
        students.setStudentId(null);
        System.out.println("Student ID = " + students.getStudentId());
        students.setStudentRollNo(1);
        System.out.println("Student Roll No = " + students.getStudentRollNo());
        students.setStudentName("Pratyasha");
        System.out.println("Student Name = " + students.getStudentName());
        students.setStudentAge(183);
        System.out.println("Student Age = " + students.getStudentAge());
        students.setStudentEmail("Pratyasha@gmail.com");
        System.out.println("Student Email = " + students.getStudentEmail());
        students.setStudentMobileNo(978576443l);
        System.out.println("Student Mobile No = " + students.getStudentMobileNo());
        students.setStudentDob("15-06-2003");
        System.out.println("Student DOB = " + students.getStudentDob());
        students.setStudentMarks(98.67f);
        System.out.println("Student Marks = " + students.getStudentMarks());
        students.setStudentDoj("15-02-2027");
        System.out.println("Student DOJ = " + students.getStudentDoj());
        students.setStudentParentName("Satyabhama Pradhan");
        System.out.println("Student Parent Name = " + students.getStudentParentName());
        students.setStudentAddress("Baleshwar");
        System.out.println("Student Address = " + students.getStudentAddress());

        String[] courses = {"Java", "HTML", "CSS", "JavaScript", "MySQL", "Git", "Linux"};
        students.setStudentCoures(courses);

        System.out.println("Selected Courses:");

        for (String course : students.getStudentCoures()) {
            System.out.println(course);
        }

        String errorMessage = students.checkAllInformationIsCorrect();
        System.out.println(errorMessage);


        



        }
}
