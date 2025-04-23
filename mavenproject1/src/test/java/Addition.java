/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT20
 */
public class Addition {

    private Addition addition;

    public Addition() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass: Runs once before all tests.");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass: Runs once after all tests.");
    }

    @Before
    public void setUp() {
        System.out.println("Before: Runs before each test.");
        addition = new Addition(); // create a new instance before each test
    }

    @After
    public void tearDown() {
        System.out.println("After: Runs after each test.");
        addition = null; // clean up
    }

    @Test
    public void testAdd() {
        System.out.println("Running testAdd...");
        int result = addition.add(10, 20);
        assertEquals("10 + 20 should equal 30", 30, result);
    }

    // You can add more tests below
}
