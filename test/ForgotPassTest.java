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
public class ForgotPassTest {
    
    public ForgotPassTest() {
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
     * Test of Search method, of class ForgotPass.
     */
    @Test
    public void testSearch() {
        System.out.println("Search");
        ForgotPass instance = new ForgotPass();
        instance.Search();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Retrive method, of class ForgotPass.
     */
    @Test
    public void testRetrive() {
        System.out.println("Retrive");
        ForgotPass instance = new ForgotPass();
        instance.Retrive();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ForgotPass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ForgotPass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
