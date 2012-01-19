/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

import java.util.Observable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author lindcjan
 */
public class ManagerTest {

    public ManagerTest() {
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
     * Test of createTube method, of class Manager.
     */
    @Test
    public void testCreateTube() {
        System.out.println("createTube");
        Manager instance = new Manager();
        Tube expResult = null;
        Tube result = instance.createTube();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyTube method, of class Manager.
     */
    @Test
    public void testDestroyTube() {
        System.out.println("destroyTube");
        Tube t = null;
        Manager instance = new Manager();
        instance.destroyTube(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Manager.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        Manager instance = new Manager();
        instance.update(o, arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}