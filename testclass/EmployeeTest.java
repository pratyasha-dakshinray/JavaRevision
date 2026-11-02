package testclass;
public class EmployeeTest {

    public static void main(String[] args) {

        Employee suraj = new Employee();

        suraj.setEmployeeId(1);
        suraj.setEmployeeName("Pratyasha");
        suraj.setEmployeeAge(23);
        suraj.setEmployeeEmail("pratyasha@gmail.com");
        suraj.setEmployeeMobileNo(978576443L);
        suraj.setEmployeeDob("15-06-2001");
        suraj.setEmployeeSalary(35000.0f);
        suraj.setEmployeeDoj("15-02-2025");
        suraj.setEmployeeDepartment("IT");
        suraj.setEmployeeAddress("Baleshwar");

        String[] skills = {"JAVA", "SQL", "HTML"};
        suraj.setEmployeeSkills(skills);

        System.out.println("Pratyasha info : " + suraj);

        String errorMessage = suraj.validateEmployeeInfo(suraj);

        if(errorMessage.equals("")) {
            System.out.println("Employee info is correct : ");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }

    }
}
