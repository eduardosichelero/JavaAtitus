package aula002;

/**
 * ex001
 */
public class ex001 {

    public static void main(String[] args) {
        int var01 = 4;
        int var02 = 2;

        var01 = 512; 
        System.out.println("Variavel possui o valor de: "+ var01);

        var02 = var01 / var02;
        System.out.println("Variavel 2 possui o valor de: " + var02);
        System.out.println("O calculo foi: "+ var01 + "/" + var02);
    }

}