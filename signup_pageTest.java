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
public class signup_pageTest {
    
    public signup_pageTest() {
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
     * Test of signUpUser method, of class signup_page.
     */
    @Test
     public void testSignUpUser() {
        System.out.println("signUpUser");

        JTextField txt_f_name = new JTextField("admin");
        JTextField txt_email = new JTextField("admin@gmail.com");
        JTextField txt_pass = new JTextField("12345678");
        JTextField txt_c_pass = new JTextField("12345678");
        JTextField txt_user_type = new JTextField("admin");

        signup_page instance = new signup_page();

        instance.signUpUser(txt_f_name, txt_email, txt_pass, txt_c_pass, txt_user_type);

        assertEquals("", txt_f_name.getText());  
        assertEquals("", txt_email.getText());   
        assertEquals("", txt_pass.getText());    
        assertEquals("", txt_c_pass.getText());  
        assertEquals("", txt_user_type.getText());  
    }


    /**
     * Test of main method, of class signup_page.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        signup_page.main(args);
    }
    
}

