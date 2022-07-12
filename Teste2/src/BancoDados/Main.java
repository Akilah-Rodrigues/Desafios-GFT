package BancoDados;

    public class Main {

        public static void main(String[] args) {
            Conta cc = new ContaCorrente();
            Conta poupanca = new ContaPoupança();

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
}
