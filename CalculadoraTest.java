

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{
    private Operacion[] operacio1;
    private Operacion sUMA1;
    private Operacion pOTENCIA1;

    /**
     * Default constructor for test class CalculadoraTest
     */
    public CalculadoraTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        operacio1 = Operacion.values();
        sUMA1 = operacio1[0];
        pOTENCIA1 = operacio1[4];
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
