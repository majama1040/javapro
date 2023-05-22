class number1{
    public int num1;
    public int num2;
}
class addition extends number1{
    public int sum(){
        return num1 + num2;
    }
}
class multiplication extends number1{
    public int mul(){
        return num1 * num2;
    }
}
public class pr16 {
    public static void main(String[] args) {
        addition a1 = new addition();
        a1.num1=10;
        a1.num2=10;
        System.out.println("Addition = " + a1.sum());
        multiplication a2 = new multiplication();
        a2.num1=10;
        a2.num2=10;
        System.out.println("Addition = " + a2.mul());
    }
}
