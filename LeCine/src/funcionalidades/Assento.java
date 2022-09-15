package funcionalidades;

public class Assento {
    private int[] letras;
    private char[] alfa;
    private int[] numsCad;

    public Assento() {
        alfa = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
        letras = new int[12];
        for (int i=0; i<12; i++){
            int j = i;
            letras[i] = j+1;
        }
        numsCad = new int[14];
    }

    public int[] getLetras() {
        return letras;
    }

    public void setLetras(int[] letras) {
        this.letras = letras;
    }

    public char[] getAlfa() {
        return alfa;
    }

    public void setAlfa(char[] alfa) {
        this.alfa = alfa;
    }

    public int[] getNumsCad() {
        return numsCad;
    }

    public void setNumsCad(int[] numsCad) {
        this.numsCad = numsCad;
    }

    public void compraAssento(String assento){
//        assento.split();
    }
}
