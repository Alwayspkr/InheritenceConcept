package InheritenceInterface;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Barking...!");
    }

    @Override
    public void eat() {
        System.out.println("buiskets");

    }

    @Override
    public void doing() {
        System.out.println("Sleeping..!");

    }
}
