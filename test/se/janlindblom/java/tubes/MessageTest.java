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
public class MessageTest {

    public MessageTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSender method, of class Message.
     */
    @Test
    public void testGetSender() {
        System.out.println("getSender");
        Message instance = new MessageImpl();
        int expResult = 0;
        int result = instance.getSender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSender method, of class Message.
     */
    @Test
    public void testSetSender() {
        System.out.println("setSender");
        int sender = 0;
        Message instance = new MessageImpl();
        instance.setSender(sender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class Message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = new MessageImpl();
        int expResult = 0;
        int result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecipient method, of class Message.
     */
    @Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        int recipient = 0;
        Message instance = new MessageImpl();
        instance.setRecipient(recipient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Message.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Message instance = new MessageImpl();
        Type expResult = null;
        Type result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Message.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        Type type = null;
        Message instance = new MessageImpl();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayload method, of class Message.
     */
    @Test
    public void testGetPayload() {
        System.out.println("getPayload");
        Message instance = new MessageImpl();
        Payload expResult = null;
        Payload result = instance.getPayload();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayload method, of class Message.
     */
    @Test
    public void testSetPayload() {
        System.out.println("setPayload");
        Payload payload = null;
        Message instance = new MessageImpl();
        instance.setPayload(payload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MessageImpl extends Message {
    }

}