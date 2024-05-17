public class CubeRunner {
    public static void main(String[] args){
        Cube Neil = new Cube(3);
        double volume = Neil.volume();
        double surfaceArea = Neil.surfaceArea();
        System.out.println(" The surface area is " + surfaceArea + " sq. units");
        System.out.println(" The volume is " + volume + " cu. units");
        Neil.setSideForVolume(125);
        double side = Neil.getSide();
        double surfaceArea2 = Neil.surfaceArea();
        System.out.println(" The side is now " + side + " units");
        System.out.println(" The surface area is " + surfaceArea2+ " sq. units");
    }
    
}
