class declare_number{
    public int num1;
    public int num2;
}
class set_num extends declare_number{
    public void get_num(int a,int b){
        num1 = a;
        num2 = b;
    }
}
class add_number extends set_num{
    public int add_num(){
        return num1 + num2;
    }
}
public class pr15 {
    public static void main(String[] args) {
        add_number a1 = new add_number();
        a1.get_num(5,5);
        System.out.println("The sum of the number is : "+ a1.add_num());
    }
}
