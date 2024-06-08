package BancoDigitalDIO;

public interface Funcionalidades {
    void depositar(double valor);
    void sacar(double valor);
    void transferencia(double valor, Conta conta);
    void imprimirExtrato();
}
