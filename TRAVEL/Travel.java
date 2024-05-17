public class Travel {
    private int people;

    public Travel (int n) {
        people = n;

    }
    public int goByVan(){
        int numVans = ((people -1)/8) + 1;
        return numVans;

    }
    public int goByCanoe(){
        int numCanoes = ((people -1)/3) + 1;
        return numCanoes;
    }
    public int goByPlane(){
        int numPlanes = ((people -1)/12) + 1;
        return numPlanes;
    }
    
}
