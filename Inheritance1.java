class Car{
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;
 Car(String color,String model,String brand,int mileage,int no_of_gears){
    this.color=color;
    this.model=model;
    this.brand=brand;
    this.mileage=mileage;
    this.no_of_gears=no_of_gears;   
 }

void applyBrake(){
    System.out.println("Brake applied");
}
void applySpeed(){
    System.out.println("Speed applied");
}
void shiftGear(){
    System.out.println("Gear shifted");
}
}
class Verna extends Car{
int capacity;
    Verna(String color,String model,String brand,int mileage,int no_of_gears,int capacity){
        super(color,model,brand,mileage,no_of_gears);
        this.capacity=capacity;
     
    }

      void airbags(){
        System.out.println("Airbags are present");  
      }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Verna v=new Verna("black", "second 2", "Hyundai", 150, 6, 5);
        v.airbags();
        v.applyBrake();
        v.applySpeed();
        v.shiftGear();
        System.out.println("color:"+v.color);
        System.out.println("model:"+v.model);
        System.out.println("brand:"+v.brand);
        System.out.println("mileage:"+v.mileage);
        System.out.println("no_of_gears:"+v.no_of_gears);
        System.out.println("capacity:"+v.capacity);
    }
}
