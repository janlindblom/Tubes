/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.janlindblom.java.tubes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author lindcjan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({OutletTest.class, InletTest.class, TubeTest.class, MessageTest.class, ManagerTest.class, TypeTest.class, PayloadTest.class})
public class TubesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}