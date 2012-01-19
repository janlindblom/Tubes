/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author lindcjan
 */
public class InletTest {

    public InletTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of connect method, of class Inlet.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Tube t = null;
        Inlet instance = new Inlet();
        instance.connect(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}