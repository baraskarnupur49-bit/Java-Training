interface A{

    public static final int x=10;
    void show();

    default void present(){
        System.out.println("inside A");
    }
}
interface B{
    /*default void show(){
        System.out.println("showwwwwwwwwwwwwww..........");
    }*/
    default void presentB(){
        System.out.println("inside B");
    }
}
class C implements A,B{
    public void present (){
        B.super.presentB();
        A.super.present();
    }
    public void show(){
        System.out.println("showing..........");

    }
}
public class Interface3 {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.present();
    }
}
