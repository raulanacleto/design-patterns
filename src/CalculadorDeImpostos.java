public class CalculadorDeImpostos {

    public void realizouCalculo(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }

}
