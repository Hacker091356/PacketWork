public class TravelRunner {
    public static void main(String[] args){
        
        for (int i = 6; i < 40; i+=2){
            Travel Neil = new Travel(i);
           int van = Neil.goByVan();
           int canoe = Neil.goByCanoe();
           int plane = Neil.goByPlane();
           System.out.println("You will need " + plane + " plane(s), or " + canoe + "canoe(s) or " + van + " van(s)" );
        }


    
    }

}
