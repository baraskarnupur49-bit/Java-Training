
interface Animal {
    void sound();

    default void eat() {
        System.out.println("eating");
    }
}

interface Bird extends Animal {
    void fly();

    default void sleep() {
        System.out.println("Sleeping");
    }
}

class Sparrow implements Bird {
    public void sound() {
        System.out.println("Sparrow chirp...");
    }

    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

public class Interface1 {
    public static void main(String[] args) {

        Bird b = new Sparrow();  

        b.sound();
        b.eat();
        b.fly();     
        b.sleep();   
    }
}