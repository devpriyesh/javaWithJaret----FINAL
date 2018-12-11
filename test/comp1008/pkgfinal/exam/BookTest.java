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
 * @author 16473
 */
public class BookTest {
    
    Book validBook;
    Author author;
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        author = new Author("Fred Flintstone","fred@rocks.com",'m');
        validBook = new Book("How to Ace a Test", author, 79.99, 6);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInvalidQuantity() {
        try{
            Book book = new Book("How to Ace a Test", author, 79.99, -6);
        }catch(IllegalArgumentException e)
        {
            System.out.println("negative quanity in book constructor "+e.getMessage());
        }
        catch(Exception e)
        {
            fail("negative quantity in constructor should trigger an IllegalArgumentException");
        }
    }

    
    @Test
    public void testInvalidPrice() {
        try{
            Book book = new Book("How to Ace a Test", author, -79.99, 6);
        }catch(IllegalArgumentException e)
        {
            System.out.println("negative price in book constructor "+e.getMessage());
        }
        catch(Exception e)
        {
            fail("negative price in constructor should trigger an IllegalArgumentException");
        }
    }

    @Test
    public void testInvalidBookName() {
        try{
            Book book = new Book("", author, 79.99, 6);
        }catch(IllegalArgumentException e)
        {
            System.out.println("empty string in book constructor "+e.getMessage());
        }
        catch(Exception e)
        {
            fail("empty book name in constructor should trigger an IllegalArgumentException");
        }
    }
    
    
    
    /**
     * Test of getBookName method, of class Book.
     */
    @Test
    public void testGetBookName() {
        String expResult = "How to Ace a Test";
        String result = validBook.getBookName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookName method, of class Book.
     */
    @Test
    public void testSetBookName() {
        String expResult = "Trouble in paradise";
        validBook.setBookName(expResult);
        assertEquals(expResult, validBook.getBookName());
    }
    
    /**
     * Test of setBookName method, of class Book.
     */
    @Test
    public void testSetBookNameInvalid() {
        try{
            String expResult = "";
            validBook.setBookName(expResult);
            fail("setBookName with an empty String should trigger an exception");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("empty book name exception "+e.getMessage());
        }
        catch (Exception e)
        {
            fail("wrong exception type thrown when setBookName is called with empty String");            
        }
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        Author expResult = author;
        Author result = validBook.getAuthor();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPrice method, of class Book.
     */
    @Test
    public void testGetPrice() {
        double expResult = 79.99;
        double result = validBook.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Book.
     */
    @Test
    public void testSetPrice() {
        double price = 14.05;
        validBook.setPrice(price);
        assertEquals(price, validBook.getPrice(), 0.0);
    }


    /**
     * Test of setPrice method, of class Book.
     */
    @Test
    public void testSetPriceInvalid() {
        double price = -1;
        try{
            validBook.setPrice(price);
            fail("Book with a price of -1 should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("negative price exception "+e.getMessage());
        }
        catch (Exception e)
        {
            fail("Book with a negative price should trigger an IllegalArgumentException");
        }
    }


    /**
     * Test of getQuantityInStock method, of class Book.
     */
    @Test
    public void testGetQuantityInStock() {
        int expResult = 6;
        int result = validBook.getQuantityInStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantityInStock method, of class Book.
     */
    @Test
    public void testSetQuantityInStock() {
        int quantityInStock = 10;
        validBook.setQuantityInStock(quantityInStock);
        assertEquals(quantityInStock, validBook.getQuantityInStock());
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        String expResult = "How to Ace a Test by Fred Flintstone costs $79.99";
        String result = validBook.toString();
        assertEquals(expResult, result);
    }
    
    
}
