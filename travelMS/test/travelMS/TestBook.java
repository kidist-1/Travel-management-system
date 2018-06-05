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
    public void setUp() {
        B= new BookPackage();
       /* BookPackage B[] = new BookPackage[20];
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
}
