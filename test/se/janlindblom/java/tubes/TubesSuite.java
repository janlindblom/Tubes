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
@Suite.SuiteClasses({se.janlindblom.java.tubes.TubeTest.class,se.janlindblom.java.tubes.MessageTest.class,se.janlindblom.java.tubes.OutletTest.class,se.janlindblom.java.tubes.InletTest.class,se.janlindblom.java.tubes.ManagerTest.class})
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