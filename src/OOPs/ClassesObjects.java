package OOPs;

// import java.util.Arrays;

public class ClassesObjects {
    public static void main(String[] args) {
      Student[] students = new Student[5];
      for(int i=0; i<5; i++){
        students[i] = new Student();
      }
    //   students[1].rno = 1;
    //   students[1].name = "Aditya";
    //   students[1].marks = 91.4f;

      // System.out.println(Arrays.toString(students));
      
      Student rohan = new Student();
    // rohan.rno=13;
    // rohan.name="Rohan Mehra";
    //   rohan.marks=88.89f;
      System.out.println(rohan.rno);

      Student Rahul = new Student(14, "Rahul", 68.6f);
      Rahul.changeName("Rahul Sehgal");
      Rahul.greeting();
    //   System.out.println(Rahul.rno);
    //   System.out.println(Rahul.name);
    //   System.out.println(Rahul.marks);

      Student Random = new Student(Rahul);
      System.out.println(Random.rno);
      System.out.println(Random.name);
      System.out.println(Random.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks; 

    void greeting(){
        System.out.println("Hi, My name is "+  this.name);
    }

    void changeName(String newName){
        this.name=newName;
    }

    //this other will replace that students data and fill the current object's data with passed objects data
    Student (Student Other){
        this.name= Other.name;
        this.rno = Other.rno;
        this.marks = Other.marks;
    }

    Student(){
        // this.rno=13;
        // this.name="Rohan Mehra";
        // this.marks=89.9f;

        // calling a constructor from another constructor
        // internally it's like : new Student(16, "default person", 100.0f)
        this (16, "default person", 100.0f);
    }

    Student(int rno, String name, float marks){
        this.rno= rno;
        this.name= name;
        this.marks= marks;
    }

}
