class area_circle_rectangle{
    private float radius;
    private float length;
    private float width;
    public float area(float r){
        return (3.14f*r*r);
    }
    public float area(float l,float w){
        return (l*w);
    }
}
public class pr10 {
    public static void main(String[] args) {
        area_circle_rectangle a1 = new area_circle_rectangle();
        System.out.println("Area of circle is : " + a1.area(2));
        System.out.println("Area of rectangle is : " + a1.area(5,5));

    }
}
