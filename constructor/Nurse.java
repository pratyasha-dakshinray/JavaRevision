package constructor;

public class Nurse {
    //Declaration of member variables
    private int age;
    private String name;
    private int id;
    private String address;

    //Constructor call
    //No parameters
    public Nurse() {
        System.out.println("I am a default constructor");
    }

    //Single Parameter
    public Nurse(int age, String name, String address, int id) {
        this.address = address;
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("I am a multiple parameterized constructor");
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Nurse{" + "age=" + age + ", name=" + name + ", id=" + id + ", address=" + address + '\'' + '}';
    }

}
