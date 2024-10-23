import java.util.Scanner;

class Student{
    String name, ID;
    Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    Student(){}
}
public  class  Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student hocSinhA;
        hocSinhA = new Student(sc.nextLine(), sc.nextLine());
        Student hocSinhB = new Student();
        System.out.println(hocSinhA.ID);
    }
}