package BancoDigitalDIO;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

     public void emprestimo(double valor){
       depositar(valor);
        cliente.setSaldoDevedor(valor);
    }

    public void pagarEmprestimo(double valor){
        if (valor <= cliente.getSaldoDevedor()){
            cliente.setSaldoDevedor(cliente.getSaldoDevedor() - valor);
        }else{
            depositar(valor-cliente.getSaldoDevedor());
            cliente.setSaldoDevedor(0);
        }
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== CONTA CORRENTE ===");
        imprimirInfoComum();
    }
}
