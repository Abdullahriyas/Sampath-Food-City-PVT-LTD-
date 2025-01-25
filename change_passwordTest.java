/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class change_passwordTest {
    
    public change_passwordTest() {
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
     * Test of updateUserPassword method, of class change_password.
     */
    @Test
    public void change_password() {
        System.out.println("updateUserPassword");

        JTextField txtU_name = new JTextField("Abdullah");
        JTextField txtO_pass = new JTextField("12345678");
        JTextField txtn_pass = new JTextField("12345678");
        JTextField txtc_pass = new JTextField("12345678");
        JTextField txtU_typ = new JTextField("admin");

        change_password instance = new change_password();

        instance.updateUserPassword(txtU_name, txtO_pass, txtn_pass, txtc_pass, txtU_typ);

        assertEquals("", txtU_name.getText());
        assertEquals("", txtO_pass.getText());
        assertEquals("", txtn_pass.getText());
        assertEquals("", txtc_pass.getText());
        assertEquals("", txtU_typ.getText());
    }

    /**
     * Test of main method, of class change_password.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        change_password.main(args);

    }
}
