package java_oops;
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is pecking at food.");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping in its nest.");
    }

    void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
