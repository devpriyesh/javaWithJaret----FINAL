/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008.pkgfinal.exam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Priyesh Hingrajia == 200397594
 */
public class AuthorTest {
    
    private Author validAuthor;
    
    public AuthorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validAuthor = new Author("Fred Flintstone","fred@rocks.com",'m');
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Author.
     */
    @Test
    public void testGetName() {
        String expResult = "Fred Flintstone";
        String result = validAuthor.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Author.
     */
    @Test
    public void testSetName() {
        validAuthor.setName("Barney Rubble");
        String expResult = "Barney Rubble";
        assertEquals(expResult, validAuthor.getName());
    }

    /**
     * Test of setName method, of class Author.
     */
    @Test
    public void testSetNameInvalid() {
        try{
            validAuthor.setName("");
            fail("author with an empty name should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("empty author name: "+e.getMessage());
        }
        catch (Exception e)
        {
            fail("Wrong type of exception triggered for invalid argument in setName");
        }
    }

    
    /**
     * Test of getEmail method, of class Author.
     */
    @Test
    public void testGetEmail() {
        String expResult = "fred@rocks.com";
        String result = validAuthor.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Author.
     */
    @Test
    public void testSetEmail() {
        String expResult = "rock@crusher.com";
        String email = "rock@crusher.com";
        validAuthor.setEmail(email);
        assertEquals(expResult, validAuthor.getEmail());
    }
    
    @Test
    public void testSetEmailInvalid() {
        try{
            validAuthor.setEmail("");
            fail("author with an empty email should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("empty author email: "+e.getMessage());
        }
        catch (Exception e)
        {
            fail("wrong type of exception thrown for setEmail with invalid input");
        }
    }


    /**
     * Test of getGender method, of class Author.
     */
    @Test
    public void testGetGender() {
        char expResult = 'm';
        char result = validAuthor.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Author.
     */
    @Test
    public void testSetGenderF() {
        char gender = 'f';
        validAuthor.setGender(gender);
        assertEquals(gender, validAuthor.getGender());       
    }
    
    /**
     * Test of setGender method, of class Author.
     */
    @Test
    public void testSetGenderO() {
        char gender = 'o';
        validAuthor.setGender(gender);
        assertEquals(gender, validAuthor.getGender());       
    }


    /**
     * Test of setGender method, of class Author.
     */
    @Test
    public void testSetGenderInvalid() {
        char gender = 'w';
        try{
            validAuthor.setGender(gender);
            fail("gender of 'w' should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("invalid gender exception "+e.getMessage());
        }
        catch (Exception e)
        {
            fail("Wrong type of exception thrown for setGender invalid");
        }
    }

    /**
     * Test of toString method, of class Author.
     */
    @Test
    public void testToString() {
        String expResult = "Fred Flintstone -> fred@rocks.com";
        String result = validAuthor.toString();
        assertEquals(expResult, result);        
    }
    
}
