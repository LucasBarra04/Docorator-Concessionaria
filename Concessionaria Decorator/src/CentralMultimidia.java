public class CentralMultimidia extends CarroDecorator{
    public CentralMultimidia(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Central Multimídia";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2500.00;
    }
}
