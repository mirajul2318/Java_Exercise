package Inheritance_01;

class Animal {
    void move() {
        System.out.println("The animal moves.");
    }
}

class Cheetah extends Animal {
    void move() {
        System.out.println("The cheetah runs.");
    }
}

public class Problem_06 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        //genericAnimal.move();

        Cheetah fastAnimal = new Cheetah();
        fastAnimal.move();
    }
}

