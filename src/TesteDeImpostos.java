import com.sun.xml.internal.ws.wsdl.writer.document.Import;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto icms = new Icms();
        Imposto iss = new Iss();
        Imposto iccc = new Iccc();

        Orcamento orcamento = new Orcamento(500);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        calculador.realizouCalculo(orcamento, icms);
        calculador.realizouCalculo(orcamento, iss);
        calculador.realizouCalculo(orcamento, iccc);

    }
}
