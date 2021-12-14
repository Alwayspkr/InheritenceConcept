package Inheritencesample;

import Inheritencesample.Cat;
import Inheritencesample.Dog;

public class InheritenceMain {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.sound();
        dog1.eat();
        dog1.sleeping();

      Cat cat =  new Cat();
      cat.sleeping();
      cat.sound();
      cat.eat();


    }
}
