public class Main {

    public static void main(String[] args) {
        Cliente RicardoSilva = new Cliente();
        RicardoSilva.setNome("RicardoSilva");

        Conta cc = new ContaCorrente(RicardoSilva);
        Conta poupanca = new ContaPoupanca(RicardoSilva);

        cc.depositar(130);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}