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

        qtdCvj *= 5.00;
        qtdRft *= 3.00;
        qtdEpt *= 7.00;

        if (sexo == 'F' || sexo == 'f') {
            ingresso = 8.00;
        } else {
            ingresso = 10.00;
        }
        consumo = qtdCvj + qtdRft + qtdEpt;
        if (consumo < 30.00) {
            total = consumo + ingresso + 4.00;
            couvert = "Couvert = R$ 4.00";

        }

        else {
            total = consumo + ingresso;
            couvert = "Isento de Couvert";
        }
        System.out.println();
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        System.out.println(couvert);
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", total);

        sc.close();
    }
}