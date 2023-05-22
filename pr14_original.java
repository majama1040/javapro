class single_in{
    public int a;
    public int b;
}

class  add extends single_in{
    public int add(){
        return a + b;
    }
}

public class pr14_original {
    public static void main(String[] args) {
    add a1 = new add();
    a1.a=10;
    a1.b=10;
        System.out.println(a1.add());

    }

}
