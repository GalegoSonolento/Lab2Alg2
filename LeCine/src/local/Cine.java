package local;

public class Cine {
    private int[][] assentos;
    //private final static as = 14;

    public Cine(){
        new Cine(14, 12);
    }
    public Cine(int q1,int q2){
        assentos = new int[q1][q1];
    }
}
