public class TesteDeInvestimentos {


    public static void main(String[] args) {
        Arrojado arrojado = new Arrojado();
        Conta conta = new Conta(0);

        RealizadorDeInvestimentos investe = new RealizadorDeInvestimentos();

        investe.realiza(conta, arrojado);
    }

}
