class staticexample{
    static int count = 0 ;
    public staticexample(){
        count++;
        System.out.println(count);
    }
}

public class pr8 {
    public static void main(String[] args) {
        staticexample a1 = new staticexample();
        staticexample a2 = new staticexample();
        staticexample a3 = new staticexample();
    }
}
