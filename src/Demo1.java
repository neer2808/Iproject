import java.util.Scanner;

// definition class
class stu
{
  int rollno;
  String name;
  int marks[] ;  // declaration
  stu()// non parameterized
  {
    Scanner s = new Scanner(System.in);
    rollno = s.nextInt();
    s.nextLine();
    name = s.nextLine();
    marks = new int[5];

    for (int i = 0; i < marks.length; i++) {
      marks[i] = s.nextInt();
    }
  }
  public void display() // instance area
  {
    System.out.println(rollno);
    System.out.println(name);
    for (int i = 0; i <marks.length ; i++) {
      System.out.println(marks[i]);
    }
  }
}
// Execution class
public class Demo1 {
  public static void main(String[] args) {
 // int arr1[]= new int[5];
  stu arr2[]= new stu[5];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i]= new stu();
    }
    for (int i = 0; i <arr2.length ; i++) {
      arr2[i].display();
    }

  stu obj1 = new stu();
  stu obj2 = new stu();
  obj1.display();
  obj2.display();
  }
}
