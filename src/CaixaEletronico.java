public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 49.5;
        double valorSolicitado = 25.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual é " + saldo);

        }else
            System.out.println("Saldo insuficiente");

    }
}