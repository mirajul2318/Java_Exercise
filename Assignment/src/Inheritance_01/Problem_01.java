package Inheritance_01;

class Animal1 {
    void makeSound() {
        System.out.println("Animal make a sound");
    }
}

class Cat extends Animal1 {
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Problem_01 {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        myAnimal.makeSound();

        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
