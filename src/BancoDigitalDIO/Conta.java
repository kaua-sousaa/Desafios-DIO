package BancoDigitalDIO;

public abstract class Conta implements Funcionalidades{

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo -valor >=0){
            saldo -=valor;
        }else{
            throw new RuntimeException ("faltou dinheiro");
        }
    }

    @Override
    public void transferencia(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComum(){
        System.out.printf("Titular %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.printf("Saldo devedor: %.2f%n", this.cliente.getSaldoDevedor());
    }
}
