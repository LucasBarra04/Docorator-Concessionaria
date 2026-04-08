public abstract class CarroDecorator implements Carro {
    protected Carro carroDecorado;

    public CarroDecorator(Carro carro) {
        this.carroDecorado = carro;
    }

    @Override
    public String getDescricao() {
        return carroDecorado.getDescricao();
    }

    @Override
    public double getPreco() {
        return carroDecorado.getPreco();
    }
}
