package OOPS;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.setColor("Blue");  
        // System.out.println(p1.getcolor());
        // p1.setPrice(15);
        // System.out.println(p1.getPrice());
        // p1.setColor("Yellow");
        // System.out.println(p1.getcolor());

        // BankAccount Myacc=new BankAccount();
        // Myacc.username="satish";
        // Myacc.setPassword("1234");


        // System.out.println(s1.name);
        Student s1= new Student();

        s1.name="Satish";
        s1.roll=1234;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=50;
        s1.marks[2]=200;

        Student s2=new Student(s1);
        s2.password="xyz";

        s1.marks[2]=100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    // copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
    }

    Student(){
        marks=new int[3];
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
}

// class BankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password=pwd;
//     }

// }

class Pen{
   private String color;
    private int price;

    String getcolor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }
    void setColor(String newColor){
        color =newColor;

    }

    void setPrice(int newprice){
        price=newprice;
    }
}