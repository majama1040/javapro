public class pr2 {
    public static void main(String[] args){
        int num1 = 1234, rev=0,num2;
        while (num1>0){
            num2 = num1 % 10;
            rev = rev * 10 + num2;
            num1 = num1/10;
        }
        System.out.println(rev);
    }
}
