/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

import java.util.Observable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lindcjan
 */
public class TubeTest {

    public TubeTest() {
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
     * Test of addInlet method, of class Tube.
     */
    @Test
    public void testAddInlet() {
        System.out.println("addInlet");
        Inlet i = null;
        Tube instance = new Tube();
        instance.addInlet(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteInlet method, of class Tube.
     */
    @Test
    public void testDeleteInlet() {
        System.out.println("deleteInlet");
        Inlet i = null;
        Tube instance = new Tube();
        instance.deleteInlet(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Tube.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        Tube instance = new Tube();
        instance.update(o, arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}