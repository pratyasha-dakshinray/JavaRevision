package constructor;

public class Doctor {

    private int age;
    private String name;

    public Doctor() {
        System.out.println("I am a default constructor");
    }

    public Doctor(String name) {
        this.name = name;
        System.out.println("I am a single parameter name constructor");
    }

    public Doctor(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("I am a parameterized constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

