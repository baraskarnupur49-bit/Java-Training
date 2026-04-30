public class Recur {

     static void recur(int a){
        if(a>10)
        {
            return;
        }
       System.out.println(a);
       a++;//updation statmenent
       recur(a);
       System.out.println(a);
       //a++;
     }
    public static void main(String[] args)
    {
       recur(2);//initialization
    }
}
