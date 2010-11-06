/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

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

    /**
     * Test of disconnect method, of class Inlet.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        Tube t = null;
        Inlet instance = new Inlet();
        instance.disconnect(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Inlet.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Message m = null;
        Inlet instance = new Inlet();
        instance.push(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}