
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
    @Test
    public void testesubtracao(){
        Calculadora calc = new Calculadora();
        Integer result = calc.subtracao(4, 3);
        assertEquals(1, result);

    }
    @Test
    public void testemultplicacao(){
        Calculadora calc = new Calculadora();
        Integer result = calc.multplicacao(5, 5);
        assertEquals(25, result);

    }
    @Test
    public void testedivisao(){
        Calculadora calc = new Calculadora();
        Integer result = calc.divisao(10, 2);
        assertEquals(5, result);

    }
    
}
