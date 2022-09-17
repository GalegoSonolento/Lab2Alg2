package funcionalidades;
import java.util.Arrays;

public class Mapa {
    Assento a1 = new Assento();
    private String[] alfa = a1.getAlfa();
    private int[][] cadeiras = a1.getLetras();
    private int[] mostraNums = new int[14];

    public int[] nums(){
        for (int i=1; i<mostraNums.length+1; i++)
            mostraNums[i-1] = i;
        return mostraNums;
    }

    public void mostraMapa(){
        System.out.println("Mapa das cadeiras do cinema: ");
        for (int i=0; i<cadeiras.length; i++){
            System.out.print(alfa[i] + " -- ");
            for (int j=0; j< cadeiras[i].length; j++){
                System.out.print("| " + cadeiras[i][j] + " |");
            }
            System.out.println();
        }
        System.out.print("       ");
        for (int i=0; i< nums().length; i++){
            if (i > 8){
                System.out.print(nums()[i] + "   ");
            }
            else System.out.print(nums()[i] + "    ");
        }
        System.out.println();
    }
}
