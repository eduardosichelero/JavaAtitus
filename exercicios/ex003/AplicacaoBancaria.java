import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}

public class AplicacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        while (true) {
            System.out.println("Saldo atual: " + conta.getSaldo());
            System.out.print("Digite o valor do saque ou -1 para sair: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == -1) {
                break;
            }

            conta.sacar(valorSaque);
        }

        System.out.println("Encerrando a aplicação.");
    }
}
