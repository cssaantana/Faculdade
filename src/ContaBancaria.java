//Nome: Caroline Dos Santos Santana
// 4. Criar uma classe ContaBancaria com os atributos numeroConta, titular, saldo e métodos para realizar depósitos, saques, transferências e exibir o saldo.

class ContaBancaria {
    Integer numeroConta;
    String titular;
    Double saldo;

    public ContaBancaria(Integer numeroConta, String titular, Double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    void realizarDepositos(Double valor) {
        if (valor <= 0) {
            System.out.println("Nao foi possivel realizar o deposito. Por favor, tente novamente.");
        } else {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        }
    }

    void realizarSaques(Double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Nao foi possivel realizar o saque. Por favor, tente novamente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }

    void realizarTranferencia(ContaBancaria destino, Double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Nao foi possivel realizar a transferencia. Por favor, tente novamente.");
        } else {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia de R$ " + valor + " para " + destino.titular + " realizada com sucesso!");
        }
    }

    void exibirSaldo() {
        System.out.println("Conta: " + numeroConta + " | Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}
