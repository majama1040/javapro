class number{
    private int a;
    private int b;
    public void print(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("The number is : " + this.a);
        System.out.println("The number is : " + this.b);
    }

}

public class pr7 {
    public static void main(String[] args) {
        number a1 = new number();
        a1.print(1,2);
    }
}
