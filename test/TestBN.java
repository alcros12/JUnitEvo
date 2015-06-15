/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Circle;
import Classes.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 *
 * @author Luis
 */
public class TestBN {
    
    public TestBN() {
    }
    
    Circle objCircle = new Circle();
       
    @org.junit.Test
    public void testCanCreate() {
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 1);
        double testConverted = Double.parseDouble(test);
        boolean validate = objCircle.canCreate(testConverted);
        assertTrue(validate);
    }    
    
    @org.junit.Test
    public void testAreaEquals()
    {
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 3);
        String [] getvalues = test.split(",");
        double value1 = Double.parseDouble(getvalues[0]);
        objCircle.setRadius(value1);
                
        double esperado = Double.parseDouble(getvalues[1].trim()) * Math.PI;
        
        double actual = objCircle.Area();
        assertEquals(esperado, actual, 0.01);
    }
    
    @org.junit.Test
    public void testDataEquals()
    {
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 5);
        String [] getvalues = test.split(",");
        String esperado = getvalues[0];
        String actual = getvalues[1].trim();
        assertEquals(esperado, actual);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCircleRadius0()
    {
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 7);
        double testConverted = Double.parseDouble(test);
        new Circle(testConverted);
    }
    
    @org.junit.Test(expected = ArithmeticException.class)  
    public void division0() {  
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 9);
        String [] getvalues = test.split(",");
        int numerador = Integer.parseInt(getvalues[0]);
        int denominador = Integer.parseInt(getvalues[1].trim());
        double resultado = numerador / denominador;
    } 

    @org.junit.Test
    public void testDataDifferent()
    {
        File f = new File();
        String test = f.ReadFile("TestEVO.txt", 11);
        String [] getvalues = test.split(",");
        String esperado = getvalues[0];
        String actual = getvalues[1].trim();
        assertThat(actual, is(not(esperado)));
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
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
