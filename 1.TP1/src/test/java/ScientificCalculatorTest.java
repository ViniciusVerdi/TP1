import org.example.ScientificCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    private ScientificCalculator calc;
    double result;

    @BeforeEach
    void CriarScientificCalculator() {
        calc = new ScientificCalculator();
    }
    // ------------------- Testes de Soma -------------------
    @Test
    public void add_DeveRetornar3_QuandoPassar1E2(){
        result = calc.add(1,2);
        Assertions.assertEquals(3,result);
    }
    // ------------------- Testes de Subtração -------------------
    @Test
    public void subtract_DeveRetornar1_QuandoPassar3E1(){
        //Setup
        //ScientificCalculator calc = new ScientificCalculator();
        //Execution
        double result = calc.subtract(3,1);
        //Assertion
        Assertions.assertEquals(2,result);
        //Teardown não é necessário

    }
    // ------------------- Testes de Raiz Quadrada -------------------
    @Test
    public void squareRoot_DeveRetornar4_QuandoPassarONumero2(){
        result = calc.squareRoot(4);

        Assertions.assertEquals(2,result);

    }

    @Test
    public void squareRoot_DeveLancarExcecao_QuandoONumeroForNegativo(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calc.squareRoot(-4)
        );
    }
    // ------------------- Testes de Divisão -------------------
    @Test
    public void divide_DeveLancarExcecao_QuandoODivisorFor0(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calc.divide(4,0)
        );
    }
    // ------------------- Testes de log -------------------
    @Test
    public void log_DeveRetornar0Ponto693_QuandoPassarONumero2(){
        result = calc.log(2);

        Assertions.assertEquals(0.6931471805599453, result, 1e-9);
    }
    // ------------------- Testes de Sin -------------------
    @Test
    public void sin_DeveRetornar0Ponto0348_QuandoPassarONumero2(){
        result = calc.sin(2);

        Assertions.assertEquals(0.03489949670250097164599518162533, result, 1e-9);
    }
}
