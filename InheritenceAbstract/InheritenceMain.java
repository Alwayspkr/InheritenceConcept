package InheritenceAbstract;

public class InheritenceMain {
    public static void main(String[] args) {


  // Animal animal = new Animal(); // compiletime error , 'Animal' is abstract; cannot be instantiated
   Animal animal = new Dog();
     animal.doing();

    Dog  dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.sound();



}}
