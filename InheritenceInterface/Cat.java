package InheritenceInterface;

public class Cat implements  Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("Nonveg");

    }

    @Override
    public void doing() {
        System.out.println("Running");

    }
}
