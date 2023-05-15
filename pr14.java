class set_number{
    public int num1;
    public int num2;
    public void get_num(int a,int b){
        num1 = a;
        num2 = b;
    }

}

class add extends set_number{
    public int add_num(){
        return num1 + num2;
    }
}



public class pr14 {
    public static void main(String[] args) {
        add a1 = new add();
        a1.get_num(5,5);
        System.out.println("The addition of the number is : " + a1.add_num());
    }
}
