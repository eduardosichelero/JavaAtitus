package exercicios.ex001;

public class ControleFluxo1 {
    public static void main(String[] args) {

        int idade = 7;
        if (idade <= 7) {
            System.out.println("Ainda é uma criança.");
        }

        else if (idade > 7 && idade <= 18)
            System.out.println("É um adolescente.");

        else if (idade > 18 && idade <= 60)
            System.out.println("É um adulto.");

        else {
            System.out.println("Esta na idade boa.");
        }

    }

}
