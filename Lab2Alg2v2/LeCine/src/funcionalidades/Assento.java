package funcionalidades;

public class Assento {
    private int[][] letras;
    private String[] alfa;
    private Mapa mapa;

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
        boolean semAssentoAlfa = true;
        boolean semAssentoNum = true;
        int index = 0;
        String[] cadeira = assento.split("");
        String letra = cadeira[0];
        String valor = "";
        if (cadeira.length >= 3) valor = cadeira[1] + cadeira[2];
        else valor = cadeira[1];
        int num = Integer.parseInt(valor);
        for (int i=0; i< alfa.length; i++)
            if (alfa[i].equalsIgnoreCase(letra)) {
                index = i;
                semAssentoAlfa = false;
                break;
            }
        for (int i=0; i< letras.length; i++){
            if (i == index)
                for (int j=0; j<letras[i].length; j++)
                    if (num == j+1){
                        letras[i][j] = 1;
                        mark = true;
                        semAssentoNum = false;
                        break;
                    }
            if (mark) {
                System.out.println("Assento marcado!");
                break;
            }
        }
        if (semAssentoAlfa || semAssentoNum) System.out.println("Assento não encontrado");
    }

    public void cancelaCompra(String assento){
        boolean mark = false;
        boolean semAssentoAlfa = true;
        boolean semAssentoNum = true;
        int index = 0;
        String[] cadeira = assento.split("");
        String letra = cadeira[0];
        String valor = "";
        if (cadeira.length >= 3) valor = cadeira[1] + cadeira[2];
        else valor = cadeira[1];
        int num = Integer.parseInt(valor);
        for (int i=0; i< alfa.length; i++)
            if (alfa[i].equalsIgnoreCase(letra)) {
                index = i;
                semAssentoAlfa = false;
                break;
            }
        for (int i=0; i< letras.length; i++){
            if (i == index)
                for (int j=0; j<letras[i].length; j++)
                    if (num == j+1){
                        if (letras[i][j] == 1){
                            letras[i][j] = 1;
                            mark = true;
                            semAssentoNum = false;
                            break;
                        }
                    }
            if (mark){
                System.out.println("Assento desmarcado!");
                break;
            }
        }
        if (semAssentoAlfa || semAssentoNum) System.out.println("Assento não encontrado");
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

    public void mostraMapa(){
        mapa = new Mapa(alfa, letras);
        mapa.mostraMapa();
    }
}
