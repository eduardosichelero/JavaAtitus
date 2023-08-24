package aula002;

import java.util.Scanner;

/**
 * Cadastro
 */
public class Cadastro {
    public static void main(String[] args) {
        Scanner lerteclado = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        String nome = lerteclado.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = lerteclado.nextInt();
        lerteclado.nextLine();

        System.out.printf("""
                nome: %s
                idade: %d
                """, nome, idade);
        lerteclado.close();
    }

}


