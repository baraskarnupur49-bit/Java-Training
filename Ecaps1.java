class Student{
     private int rollNo;
    private String name;
    private int age;
    
    Student(int r, String name, int age, String section){
        rollNo = r;
        this.name = name;
        this.age = age;
        this.section = section;
    }
    
    private String section;
     private void study(){
        System.out.println("Dont Disturb, I am Studying...........");
    }
    private void sleep(){
        System.out.println("I am Sleeping...........");
    }
    public int getrollNo(){
        return this.rollNo;
    }
    public void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public int getage(){
        return this.age;
    }
    
    public void setsection(String section){
        this.section = section;
    }
    public String getsection(){
        return this.section;
    }
    public void callstudy(){
        this.study();
    }
    public void callsleep(){
        this.sleep();
    }
}

public class Ecaps1 {
    public static void main(String[] args) {
        
    Student s = new Student(1, "Nupur", 20, "A");
    System.out.println(s.getrollNo());
}
}