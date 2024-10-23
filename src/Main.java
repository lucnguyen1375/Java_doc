import java.util.Scanner;

class Student1{
    String name, ID;
    Student1(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    Student1(){}
}
public  class  Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1 hocSinhA;
        hocSinhA = new Student1(sc.nextLine(), sc.nextLine());
        Student1 hocSinhB = new Student1();
        System.out.println(hocSinhA.ID);
    }
}