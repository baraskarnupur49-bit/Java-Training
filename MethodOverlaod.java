/*public class MethodOverlaod {
   static int add(int a,int b){
        return a+b;

    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    static int add(double a,double b){
        return (int)(a+b);

    }
    public static void main(String[] args){
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10.5,20.5));
    }
} */
 class A {
void add(int a,int b)
{
    System.out.println("Total form A:"+(a+b));
}
    
}
class B extends A{
    void add(int a,int b)
    {
        System.out.println("Total form B:"+(a+b));
    }
}
public class MethodOverlaod {
    public static void main(String[] args) {
        A a = new A();
        a.add(10, 20);
        B b = new B();
        b.add(10, 20);
    }
}