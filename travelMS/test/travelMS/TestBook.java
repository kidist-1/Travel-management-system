/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelMS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHREE SHANTERI
 */
public class TestBook
{
    
    BookPackage B;
    public TestBook() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        B= new BookPackage();
      /* BookPackage[] B = new BookPackage[20];
        int i;
        
        for(i=0; i<B.length; i++)
        {
            B[i]=new BookPackage();
        }*/
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestBookManali() 
     {
         assertEquals(5500.0,B.bookManali(5500.0),0.01);
         assertEquals(11000.0,B.bookManali(5500.0),0.01);
         
         
     }
     
     @Test
     public void TestBookAndaman() 
     {
         assertEquals(20500.0,B.bookAndaman(20500.0),0.01);
         assertEquals(41000.0,B.bookAndaman(20500.0),0.01);
         
         
     }
     
     @Test
     public void TestBookGoa() 
     {
         assertEquals(5999.0,B.bookGoa(5999.0),0.01);
         assertEquals(11998.0,B.bookGoa(5999.0),0.01);
         
         
     }
     
     @Test
     public void TestBookOoty() 
     {
         assertEquals(8499.0,B.bookOoty(8499.0),0.01);
         assertEquals(16998.0,B.bookOoty(8499.0),0.01);
         
         
     }
     
     @Test
     public void TestBookLadakh() 
     {
         assertEquals(15500.0,B.bookLadakh(15500.0),0.01);
         assertEquals(31000.0,B.bookLadakh(15500.0),0.01);
         
         
     }
     
     @Test
     public void TestbookBus()
    {
 
         assertEquals(3500.0,B.bookBus(3500.0),0.01);
         
    }
     
     @Test
     public void TestbookTrain()
    {
        assertEquals(1800.0,B.bookTrain(1800.0),0.01);
    }
     
     @Test
      public void TestbookFlight()
    {
        assertEquals(10000.0,B.bookTrain(10000.0),0.01);
    }
}
