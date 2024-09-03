
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testesoma(){
        Calculadora calc = new Calculadora();
        Integer result = calc.soma(2, 2);
        assertEquals(4, result);

    }
    
}
