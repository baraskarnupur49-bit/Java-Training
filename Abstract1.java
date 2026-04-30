abstract class Animal{
    int no_of_legs;
    String name;

    abstract void sound();//abstract method

    void eat(){
        System.out.println("Donot Disturb, I am Eating...........   ");
    }
}
 abstract class Bird extends Animal{
    
    abstract void colour();

   // int no_of_legs = 2;
    //void sound(){
     //   System.out.println("Chirp Chirp...........");
    //}
    void fly(){
        System.out.println("I am Flying...........panchi banu udthi firu mast gagan me aaj mai aazad hu...........");
    }
}

class  Koyal extends Bird{
    void sound(){
        System.out.println("kooooo......kooooo...");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
    Bird b = new Koyal();
     
        b.eat();
           b.sound();
           b.no_of_legs=2;
           System.out.println("No of legs: "+b.no_of_legs);
    }
}
