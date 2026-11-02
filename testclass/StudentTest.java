package testclass;

public class StudentTest {

    public static void main(String[] args) {

        Student suraj = new Student();

        suraj.setStudentId(1);
        suraj.setStudentRollNo(1);
        suraj.setStudentName("Suraj");
        suraj.setStudentAge(25);
        suraj.setStudentEmail("suraj@gmail.com");
        suraj.setStudentMobileNo(978576443L);
        suraj.setStudentDob("15-06-2001");
        suraj.setStudentMarks(98.67f);
        suraj.setStudentDoj("15-02-2025");
        suraj.setStudentParentName("Rajesh Kumar");
        suraj.setStudentAddress("Bihar");

        String[] courses = {"JAVA", "SQL", "HTML"};
        suraj.setStudentCoures(courses);

        System.out.println("Suraj info : " + suraj);
        Student pratyasha = null;

        String errorMessage = suraj.validateStudentInfo(pratyasha);

        if(errorMessage.equals("")) {
            System.out.println("Student info is correct : ");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }

    }
}










