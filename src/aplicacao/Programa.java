package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char sexo;
        double ingresso = 0, consumo = 0, total = 0;
        int qtdCvj, qtdRft, qtdEpt;
        String couvert = "";

        System.out.print("Sexo: ");
        sexo = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        qtdCvj = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        qtdRft = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        qtdEpt = sc.nextInt();

        sc.close();
    }
}