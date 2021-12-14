package InheritenceAbstract;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Barking");
    }

    @Override
    void eat() {
        System.out.println("Eating");

    }

    @Override
    void doing() {
        System.out.println("Sleeping..!");
    }
}
