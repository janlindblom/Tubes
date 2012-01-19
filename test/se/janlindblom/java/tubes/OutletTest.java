/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

import java.util.Observable;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author lindcjan
 */
public class OutletTest {

    public OutletTest() {
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
     * Test of connect method, of class Outlet.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Tube t = null;
        Outlet instance = new Outlet();
        instance.connect(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disconnect method, of class Outlet.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        Tube t = null;
        Outlet instance = new Outlet();
        instance.disconnect(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Outlet.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        Outlet instance = new Outlet();
        instance.update(o, arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}