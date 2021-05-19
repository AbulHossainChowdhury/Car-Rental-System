/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fahim150283
 */
public class ReturnTest {
    
    public ReturnTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Delete method, of class Return.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        Return instance = new Return();
        instance.Delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnUpdate method, of class Return.
     */
    @Test
    public void testReturnUpdate() {
        System.out.println("ReturnUpdate");
        Return instance = new Return();
        instance.ReturnUpdate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Return.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Return.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
