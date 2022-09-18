package UI;
import funcionalidades.FilmesEmCartaz;

import java.util.Scanner;
public class Menu {
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
    }

    public void ui(){
        System.out.println("1- FILMES EM CARTAZ");
        System.out.println("2- Fazer uma reserva");
        System.out.println("3- Cancelar uma reserva");
        System.out.println("4- Total de Lugares");
        System.out.println("5 - Sair");



    }

}