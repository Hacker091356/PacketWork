//package DICE;
public class DiceRunner {
    public static void main(String[] args){
        Dice Neil = new Dice();
        Neil.roll();
        int n = Neil.getTotal();
        System.out.println( n );
        Neil.roll();
        n = Neil.getTotal();
        System.out.println(n);

    }
    
}
