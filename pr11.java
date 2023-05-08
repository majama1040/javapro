class number{
    public int num1;
    public int num2;
    public number(){
        num1 = 0;
        num2 = 0;
    }
    public number(int x){
        num1 = x;
        num2 = 0;
    }
    public number(int x , int y){
        num1 = x;
        num2 = y;
    }

}
public class pr11 {
    public static void main(String[] args) {
        number a1 = new number();
        number a2 = new number(1);
        number a3 = new number(1,2);
        System.out.println("x : " + a1.num1 + "   y : "+a1.num2 );
        System.out.println("x : " + a2.num1 + "   y : "+a2.num2 );
        System.out.println("x : " + a3.num1 + "   y : "+a3.num2 );
    }
}
