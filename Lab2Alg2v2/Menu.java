package funcionalidades;
import java.util.Scanner;
public class Menu {
    Mapa m1 = new Mapa();
    Scanner sc1 = new Scanner(System.in);
    FilmesEmCartaz f1 = new FilmesEmCartaz();
    public void menu() {
        System.out.println("                                              \n" +
                "                                              \n" +
                " ___ .-. .-.     .--.    ___ .-.    ___  ___  \n" +
                "(   )   '   \\   /    \\  (   )   \\  (   )(   ) \n" +
                " |  .-.  .-. ; |  .-. ;  |  .-. .   | |  | |  \n" +
                " | |  | |  | | |  | | |  | |  | |   | |  | |  \n" +
                " | |  | |  | | |  |/  |  | |  | |   | |  | |  \n" +
                " | |  | |  | | |  ' _.'  | |  | |   | |  | |  \n" +
                " | |  | |  | | |  .'.-.  | |  | |   | |  ; '  \n" +
                " | |  | |  | | '  `-' /  | |  | |   ' `-'  /  \n" +
                "(___)(___)(___) `.__.'  (___)(___)   '.__.'   \n" +
                "                                              \n" +
                "                                              ");
        System.out.println("1- FILMES EM CARTAZ");
        f1.shrek();
        f1.miranha2();
        f1.мегамозг();

        String pergunta = sc1.nextLine();
        pergunta = "Que filme deseja assistir?";

        System.out.println("2- Fazer uma reserva");
        System.out.println("3- Cancelar uma reserva");
        System.out.println("4- Total de Lugares");
        System.out.println("5 - Sair");

    }

}
