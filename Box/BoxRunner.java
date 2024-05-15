//package BOX;
public class BoxRunner {
    public static void main(String[] args){
       Box Neil = new Box(2.0,6.0);
       double area = Neil.getArea();
       System.out.println("The area is " + area);
       Neil.bigger(2.0);
       double perimeter = Neil.getPerimeter();
       System.out.println("The perimeter is " + perimeter);

    
        
      
    }
}
