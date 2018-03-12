

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (Daniel Villalobos y Cristian Lerida)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{
    private double num1;
    private double num2;
    private double rdo;
    private Operacion op;

    /**
     * Default constructor for test class CalculadoraTest
     */
    public CalculadoraTest()
    {
        num1=0.0;
        num2=0.0;
        op=op.SUMA;
    }

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
         calc.ponNum1(2);
         calc.ponNum2(4);
         calc.ponOperacion("SUMA");
         calc.opera();
         assertEquals(6 , calc.dameResultado(),0.2);
    }
    
    @Test
    public void testResta() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(4);
         calc.ponNum2(2);
         calc.ponOperacion("RESTA");
         calc.opera();
         assertEquals(2 , calc.dameResultado(),0.2);
     }
     
    @Test
    public void   testMultiplicacion() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(5);
         calc.ponNum2(5);
         calc.ponOperacion("MULTIPLICA");
         calc.opera();
         assertEquals(25 , calc.dameResultado(),0.2);
 }
 
    @Test
    public void   testDivision() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(10);
         calc.ponNum2(2);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( 5, calc.dameResultado(),0.2);      
    } 
    
     @Test
    public void   testPotencia1() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(2);
         calc.ponNum2(10);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals(1024 ,calc.dameResultado(),0.2);        
    }
    
     @Test
    public void testRAIZ() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(5);
         calc.ponNum2(10);
         calc.ponOperacion("RAIZ");
         calc.opera();
         assertEquals(1.17 , calc.dameResultado(),0.2);     
    }
    
    @Test
    public void testLogaritmo() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(5);
         calc.ponNum2(10);
         calc.ponOperacion("LOGARITMO");
         calc.opera();
         assertEquals(2.61 , calc.dameResultado(),0.2);     
    }
    
     @Test
    public void testFactoriales() { 
        Calculadora calc = new Calculadora();
         calc.ponNum1(5);
         calc.ponNum2(10);
         calc.ponOperacion("FACTORIALES");
         calc.opera();
         assertEquals(0.0 , calc.dameResultado(),0.2);     
    }
  
}
