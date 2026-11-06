package parentchild.integer;

public class ParentChildTest {

    public static void main(String[] args) {

//         Parent parent = new Parent();
//         System.out.println("1."+parent.x);
         //output I am Parent class default constructor

         Child child = new Child();
         System.out.println("2."+child.x);
         //output I am Parent class default constructor
        // I am child class default constructor

        Parent child1 = new Child();
        System.out.println("3.child  = " + child.x); // 20

        Child child2 = new Child();
        System.out.println("4.child1 = " + child1.x); // 50

    }
}