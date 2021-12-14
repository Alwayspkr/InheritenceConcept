package InheritenceAbstract;

public class Cat extends Animal {


    @Override
    void sound() {
        System.out.println("Meow");
    }

    @Override
    void eat() {
        System.out.println("milk..1");

    }

    @Override
    void doing() {
        System.out.println("running");

    }
}
