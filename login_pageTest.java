/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ui;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdullah
 */
public class login_pageTest {
    
    public login_pageTest() {
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
     * Test of loginUser method, of class login_page.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        
        JTextField txtU_name = new JTextField("admin");
        JTextField txt_pass = new JTextField("12345678");
        JTextField txt_user_type = new JTextField("admin");

        login_page instance = new login_page();

        instance.loginUser(txtU_name, txt_pass, txt_user_type);

        assertEquals("", txt_pass.getText());  
        assertTrue(txtU_name.getText().equals("admin"));  
        assertTrue(txt_user_type.getText().equals("admin"));
    }

    /**
     * Test of main method, of class login_page.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login_page.main(args);
    }
    
}