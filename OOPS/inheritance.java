package OOPS;

public class inheritance {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        // shark.breathe();
        // shark.sam="sam";
        // System.out.println(shark.sam);
        // calculator c1=new calculator();
        // System.out.println(c1.sum(5, 4));
        // System.out.println(c1.sum((float)2.2, (float)5.4));
        // Deer d=new Deer();
        // Animal d=new Animal();
        // d.eat();
        

        // Horse H=new Horse();
        // H.eat();
        // H.walk();
        // System.out.println(H.color);

        // Chicken C=new Chicken();
        // C.eat();
        // C.walk();

        // Queen q=new Queen();
        // q.moves();

        // King K=new King();
        // K.moves();

        Student s1=new Student();
        s1.School="JM";

        Student s2=new Student();
     System.out.println(s2.School);
    }
}

class Student{
    String name;
    int rollno;

    static String School;

    void setName(String name){
         this.name=name;
    }
    String getName(){
        return this.name;
    }

}

// interface chessplayer{
//     void moves();
    
// }

// class Queen implements chessplayer{
//   public void moves(){
//         System.out.println("up,down,left,right,diagonal (in all 4 dirns)");
//     }
// }


// class Rook implements chessplayer{
//     public void moves(){
//           System.out.println("up,down,left,right");
//       }
//   }

//   class King implements chessplayer{
//     public void moves(){
//           System.out.println("up,down,left,right, diagonal-( by 1 step");
//       }
//   }


// abstract class Animal{
//     String color;
//     Animal(){
//         color="brown";
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }


// class Horse extends Animal{
//     void changeColor(){
//         color="dark brown"; 
//     }
//     void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     void changeColor(){
//         color="yellow";
//     }
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// class Animal{
//     void eat(){
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }

// class calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }


// Base  class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }


// // derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swin in water");
//     }
// }

// class Dog extends Animal{
//     String sam;
// }


