package Circle;

public class CircleRunner {
    public static void main(String[] args){
        Circle Neil = new Circle(3);
        double circumference = Neil.getC();
        System.out.println("The circumference is " + circumference);
        Neil.changeR(1);
        double area = Neil.getArea();
        System.out.print("The area is " + area);

        
     
    }
    
}
