package UI;
import UI.Menu;
import funcionalidades.Assento;
import funcionalidades.FilmesEmCartaz;

import java.util.Scanner;

public class Opcoes extends Menu {
    public void menuSys(){
        FilmesEmCartaz f1 = new FilmesEmCartaz();
        Assento as1 = new Assento();
        Scanner scanner = new Scanner(System.in);
        super.menu();
        while (true){
            super.ui();
            System.out.println("Escolha uma das opções acima: [apenas números]");
            String input = scanner.next();
            String[] seguranca = input.split("");
            int opcao = Integer.parseInt(seguranca[0]);
            if (opcao == 1){
                f1.cartaz();
                System.out.println("Deseja voltar ao menu? [S/N]");
                String input2 = scanner.next();
                String[] seg = input2.split("");
                String resp = seg[0];
                if (resp.equalsIgnoreCase("n")) break;
            }
            else if (opcao == 2){
                System.out.println("Escolha seu assento (De A a L e de 1 a 14, no formato -A1-)");
                String input3 = scanner.next();
                String[] seg1 = input3.split("");
                String parameter = "";
                if (seg1.length < 2) System.out.println("Input inválido");
                else if (seg1.length == 2) parameter = seg1[0] + seg1[1];
                else parameter = seg1[0] + seg1[1] + seg1[2];
                as1.compraAssento(parameter);
                System.out.println("Deseja voltar ao menu? [S/N]");
                String input2 = scanner.next();
                String[] seg = input2.split("");
                String resp = seg[0];
                if (resp.equalsIgnoreCase("n")) break;
            }
            else if (opcao == 3){
                System.out.println("Escolha seu assento para cancelar (De A a L e de 1 a 14, no formato -A1-)");
                String input3 = scanner.next();
                String[] seg1 = input3.split("");
                String parameter = "";
                if (seg1.length < 2) System.out.println("Input inválido");
                else if (seg1.length == 2) parameter = seg1[0] + seg1[1];
                else parameter = seg1[0] + seg1[1] + seg1[2];
                as1.cancelaCompra(parameter);
                System.out.println("Deseja voltar ao menu? [S/N]");
                String input2 = scanner.next();
                String[] seg = input2.split("");
                String resp = seg[0];
                if (resp.equalsIgnoreCase("n")) break;
            }
            else if (opcao == 4){
                System.out.println("Existem "+(12*14)+" lugares totais. \n Os quais: " +
                        "\n "+as1.livres()+" estão livres e "+as1.ocupados()+" estão ocupados.");
                System.out.println("Disposição dos lugares: ");
                as1.mostraMapa();
                System.out.println("Deseja voltar ao menu? [S/N]");
                String input2 = scanner.next();
                String[] seg = input2.split("");
                String resp = seg[0];
                if (resp.equalsIgnoreCase("n")) break;
            }
            else if (opcao == 5){
                break;
            }
            else{
                System.out.println("Opção inválida.");
                System.out.println("Deseja voltar ao menu? [S/N]");
                String input2 = scanner.next();
                String[] seg = input2.split("");
                String resp = seg[0];
                if (resp.equalsIgnoreCase("n")) break;
            }
        }
        System.out.println("<<< VOLTE SEMPRE >>>");
    }
}
