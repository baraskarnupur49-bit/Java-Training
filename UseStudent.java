class Student{
        private int roll;
        private char grade;
        private double per;
   public void setData()
{
        roll=10;
        grade='A';
        per=90.8;
}
  public void showData(){
     System.out.println(roll+","+grade+","+per);
}

}

class UseStudent{

   public static void main(String[]args){
       Student s=new Student();
       s.setData();
       s.showData();
   }
}