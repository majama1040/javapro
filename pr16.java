class get_number{
    public int num1;
    public int num2;

    public void set_number(int a , int b){
        num1 = a;
        num2 = b;
    }
}

class add_numbers extends get_number{
    public int add(){
        return num1 + num2;
    }
}

class mul_numbers extends get_number{
    public int mul(){
        return num1 * num2;
    }
}




public class pr16 {
    public static void main(String[] args) {
        add_numbers a1 = new add_numbers();
        a1.set_number(5,5);
        System.out.println("The sum of the number is  : " + a1.add());

        mul_numbers a2 = new mul_numbers();
        a2.set_number(5,5);
        System.out.println("The multiplication of the number is  : " + a2.mul());
    }
}
