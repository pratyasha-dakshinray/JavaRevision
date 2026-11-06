package parentchild.integer;

public class Child extends Parent {

    int x = 50;

    public Child() {

        System.out.println("I am child class default constructor");
        System.out.println("Parent x " + super.x);
        System.out.println("child x " + x);

        int total = super.x + x;
        System.out.println("Total = " + total);
    }
}
