package funcionalidades;

public class Assento {
    private int[][] letras;
    private String[] alfa;

    public Assento() {
        alfa = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        letras = new int[12][14];
        for (int i=0; i<12; i++){
            letras[i] = new int[14];
        }
    }
    public int[][] getLetras() {
        return letras;
    }

    public void setLetras(int[][] letras) {
        this.letras = letras;
    }

    public String[] getAlfa() {
        return alfa;
    }

    public void setAlfa(String[] alfa) {
        this.alfa = alfa;
    }

    public void compraAssento(String assento){
        boolean mark = false;
        int index = 0;
        String[] cadeira = assento.split("");
        String letra = cadeira[0];
        int num = Integer.parseInt(cadeira[1]);
        for (int i=0; i< alfa.length; i++)
            if (alfa[i].equalsIgnoreCase(letra)) {
                index = i;
                break;
            }
        for (int i=0; i< letras.length; i++){
            if (i == index)
                for (int j=0; j<letras[i].length; j++)
                    if (num == j){
                        letras[i][j] = 1;
                        mark = true;
                        break;
                    }
            if (mark) break;
        }
    }

    public void cancelaCompra(String assento){
        boolean mark = false;
        int index = 0;
        String[] cadeira = assento.split("");
        String letra = cadeira[0];
        int num = Integer.parseInt(cadeira[1]);
        for (int i=0; i< alfa.length; i++)
            if (alfa[i].equalsIgnoreCase(letra)) {
                index = i;
                break;
            }
        for (int i=0; i< letras.length; i++){
            if (i == index)
                for (int j=0; j<letras[i].length; j++)
                    if (num == j){
                        if (letras[i][j] == 1){
                            letras[i][j] = 1;
                            mark = true;
                            break;
                        }
                    }
            if (mark) break;
        }
    }

    public int livres(){
        int livres = 0;
        for (int i=0; i< letras.length; i++)
            for (int j=0; j<letras[i].length; j++)
                if (letras[i][j] == 0)
                    livres++;
        return livres;
    }

    public int ocupados(){
        int ocupados = 0;
        for (int i=0; i< letras.length; i++)
            for (int j=0; j<letras[i].length; j++)
                if (letras[i][j] == 1)
                    ocupados++;
        return ocupados;
    }
}
