public class CallByValue {

     static void add(int a,double b ,String msg){
            //double c = a+b;
            a=50;
            b=80.0;
            double c = a+b;
            msg ="hello.............";
            System.out.println("c="+c);
            System.out.println( "msg="+msg);
        }
    public static void main(String[] args)
    {

        int  a=10;
        double b =20.0;
        String msg= new String("hi.............");
        // CallByValue c= new CallByValue();
        add(a,b,msg);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("msg="+msg);

    }
}
