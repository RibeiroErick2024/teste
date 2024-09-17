import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Geometria;

public class GeometriaTest {

    @Test
    public void CalcularAreaTrianguloSucesso() {
        Geometria geometria = new Geometria();
        double resultado = geometria.CalcularAreaTriangulo(2.0, 2.0);
        double esperado = 2.0; 
        assertEquals(esperado, resultado); 
    }


@Test
public void CalcularAreaQuadradoSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularAreaQuadrado(2.0);
    double esperado = 4.0;
    assertEquals(esperado, resultado);
    
}

@Test
public void CalcularAreaCirculoSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularAreaCirculo(2.0);
    double esperado = 12.5;
    
    assertEquals(esperado, resultado, 0.1);
}

@Test 
public void CalcularAreaRetanguloSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularAreaRetangulo(2.0, 3.0);
    double esperado = 6.0;
    assertEquals(esperado, resultado);
}

@Test void CalcularVolumeCuboSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularVolumeCubo(2.0);
    double esperado = 8.0;
    assertEquals(esperado, resultado);
    

}

@Test
public void CalcularVolumeEsferaSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularVolumeEsfera(2.0);
    double esperado =  33.5;
    assertEquals(esperado, resultado, 0.1);
}


@Test
public void CalcularVolumeCilindroSucesso(){
    Geometria geometria = new Geometria();
    double resultado = geometria.CalcularVolumeCilindro(2.0, 2.0);
    double esperado = 25.1;
    assertEquals(esperado, resultado, 0.1);
}






}
