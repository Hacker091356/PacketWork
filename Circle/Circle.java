package Circle;
public class circle {
    private double radius;

    public Circle (double r) {
        radius = r; 
    }
     
    public double getArea() {
        double a = Math.PI * radius * radius; 
        return a;
    }
    public double getC() {
        double b = Math.PI * radius * 2;
        return b;

    }
    public void changeR (double r){
        radius = r;
    
    }
}
