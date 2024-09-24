import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.ContaCorrente;

public class ContaCorrenteTest {
    private ContaCorrente maria;
    private ContaCorrente jose;

    @BeforeEach
    public void setUp() {
        maria = new ContaCorrente("Maria", 200.0);
        jose = new ContaCorrente("José", 100.0);
    }

    @Test
    public void testContasCriadasCorretamente() {
        assertNotNull(maria);
        assertNotNull(jose);
    }

    @Test
    public void testSaldoDiferente() {
        assertNotEquals(maria.getSaldo(), jose.getSaldo());
    }

    @Test
    public void testSaqueMaria() {
        maria.sacar(100.0);
        assertEquals(jose.getSaldo(), maria.getSaldo());
    }

    @Test
    public void testDepositoJose() {
        jose.depositar(50.0);
        assertEquals(50.0 + maria.getSaldo(), jose.getSaldo());
    }

    @Test
    public void testSaqueAcimaDoSaldo() {
        assertFalse(maria.sacar(300.0)); 
    }

    @Test
    public void testSaqueDentroDoSaldo() {
        assertTrue(maria.sacar(50.0)); 
        assertEquals(150.0, maria.getSaldo()); 
    }
}
