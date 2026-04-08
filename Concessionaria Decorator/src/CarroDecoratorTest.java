import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroDecoratorTest {

    @Test
    void testCarroPopularSemOpcionais() {
        Carro carro = new CarroPopular();

        assertEquals("Carro Popular", carro.getDescricao());
        assertEquals(70000.00, carro.getPreco());
    }

    @Test
    void testCarroPopularComCentralMultimidia() {
        Carro carro = new CarroPopular();
        carro = new CentralMultimidia(carro);

        assertEquals("Carro Popular, Central Multimídia", carro.getDescricao());
        assertEquals(72500.00, carro.getPreco());
    }

    @Test
    void testSUVComArCondicionadoECentralMultimidia() {
        Carro carro = new SUV();
        carro = new CentralMultimidia(new ArCondicionado(carro));

        assertEquals("SUV, Ar Condicionado, Central Multimídia", carro.getDescricao());
        assertEquals(107500.00, carro.getPreco());
    }
}
