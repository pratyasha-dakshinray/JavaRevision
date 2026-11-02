package testclass;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher pratyasha = new Teacher();

        pratyasha.setTeacherId(1);
        pratyasha.setTeacherName("Pratyasha");
        pratyasha.setTeacherAge(25);
        pratyasha.setTeacherEmail("pratyasha@gmail.com");
        pratyasha.setTeacherMobileNo(978576443L);
        pratyasha.setTeacherDob("15-06-2001");
        pratyasha.setTeacherSalary(35000.0f);
        pratyasha.setTeacherDoj("15-02-2025");
        pratyasha.setTeacherSubject("Java");
        pratyasha.setTeacherAddress("Baleshwar");

        String[] courses = {"JAVA", "SQL", "HTML"};
        pratyasha.setTeacherCoures(courses);

        System.out.println("Pratyasha info : " + pratyasha);

        Teacher ayesha = null;

        String errorMessage = pratyasha.validateTeacherInfo(ayesha);

        if(errorMessage.equals("")) {
            System.out.println("Teacher info is correct : ");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }

    }
    }

