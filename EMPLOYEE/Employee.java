public class Employee{
    double salary = 0;
    public Employee(double s){
        salary = s;

    
    }
    public void increase(double i){
        if (i > 0){
            salary = salary + i;
        }
    
    }
    public double getPay(){
        return salary;
    }
}