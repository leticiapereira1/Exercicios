import org.example.tests.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest extends Calculadora {


@Test

    public void testaCaculadoraSoma(){
    Calculadora calculadora = new Calculadora();

        int resultadoEsperado = 4;

        int resultado = calculadora.somar(2,2);

    Assert.assertEquals(resultado, resultadoEsperado);
    }


}
