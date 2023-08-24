package aula003;

import java.util.Scanner;

/**
 * ex001
 */
public class ex001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota01 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Digite sua segunda nota: ");
        double nota02 = scan.nextDouble();
        scan.nextLine();

        double media = (nota01 + nota02) / 2;

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            if (media >= 3 && media < 7) {
                System.out.println("Você está em recuperaão");
            } else {
                System.out.println("Infelizmente não foi aprovado");
            }
        }

    }
}