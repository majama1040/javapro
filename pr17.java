class num_1 {
    public int num1 = 10;
    public int num2 = 10;
    public int opersation(){
        return num1 + num2;
    }
}

class num_2  extends num_1{
    public int num1 = 10;
    public int num2 = 10;

    @Override
    public int opersation(){
        return num1 * num2;
    }
}
public class pr17 {
    public static void main(String[] args) {
        num_1 a1 = new num_1();
        System.out.println(a1.opersation());
        num_2 a2 = new num_2();
        System.out.println(a2.opersation());
    }
}
