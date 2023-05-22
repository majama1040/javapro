interface run {
    public void run1();
}

interface walk {
    public void walk1();
}

class human implements run,walk{

    public void run1() {
        System.out.println("I can run");
    }
    public void walk1() {
        System.out.println("I can walk");
    }
}


public class pr15 {
    public static void main(String[] args) {
        human a1 = new human();
        a1.run1();
        a1.walk1();
    }
}
