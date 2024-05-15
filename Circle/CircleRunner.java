//package CIRCLE;

public class CircleRunner {
    public static void main(String[] args){
        Circle Neil = new Circle(3);
        double circumference = Neil.getC();
        System.out.println("The circumference is " + circumference);
        double area = Neil.getArea();
        System.out.print("The area is " + area);
        Neil.changeR(1);
        double area2 = Neil.getArea();
        System.out.println("The new area is " + area2);





    }
}
