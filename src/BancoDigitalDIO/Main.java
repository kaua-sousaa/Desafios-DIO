package BancoDigitalDIO;

public class Main {

    public static void main(String[] args) {

        Conta poupanca = new ContaPoupanca(new Cliente("Osvaldo"));
        poupanca.depositar(100);


        ContaCorrente corrente = new ContaCorrente(new Cliente("Valdisnei"));
        corrente.emprestimo(40);
        corrente.pagarEmprestimo(70);

        poupanca.imprimirExtrato();
        corrente.imprimirExtrato();

    }
}
