import java.util.*;
class student{
    Scanner a1 = new Scanner(System.in);
    int erno;
    String name;

    public void setinfo() {
        System.out.println("Enter the Enroll no : ");
        erno = a1.nextInt();
        System.out.println("Enter the name : ");
        name = a1.next();
    }
    public void getinfo(){
        System.out.println("Name of the student is : "+ name);
        System.out.println("Enrollement number of the student is : "+ erno);
    }
};
public class pr5 {
    public static void main(String[] args) {
        student a2 = new student();
        student a3 = new student();
        student a4 = new student();
        System.out.println("Enter the info of 1 student :");
        a2.setinfo();
        System.out.println("The info of 1 student is :");
        a2.getinfo();
        System.out.println("\n \n");

        System.out.println("Enter the info of 2 student :");
        a3.setinfo();
        System.out.println("The info of 2 student is :");
        a3.getinfo();
        System.out.println("\n \n");

        System.out.println("Enter the info of 3 student :");
        a4.setinfo();
        System.out.println("The info of 3 student is :");
        a4.getinfo();
        System.out.println("\n \n");

    }
}
