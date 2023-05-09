/*
*
* @author Faisal Alharbi
* */
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Red",true,5);
        System.out.println("C1 area: "+c1.getArea()+"\nC1 perimeter: "+c1.getPerimeter());
        System.out.println(c1.toString()+"\n\n");

        Rectangle r1 = new Rectangle(10,3);
        System.out.println("R1 area: "+r1.getArea()+"\nR1 perimeter: "+r1.getPerimeter());
        System.out.println(r1.toString()+"\n\n");

        Square s1 = new Square(5);
        System.out.println("S1 area: "+s1.getArea()+"\nS1 perimeter: "+s1.getPerimeter());
        System.out.println(s1.toString()+"\n\n");
        

    }
}