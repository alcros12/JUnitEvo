/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Circle;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 *
 * @author Luis
 */
public class Test {
    
    private Circle objCircle = new Circle(10);
    
    public Test() {
    }
    
    @org.junit.Test
    public void testAreaEquals()
    {
        double esperado = 100 * Math.PI;
        double actual = objCircle.Area();
        assertEquals(esperado, actual, 0.01);
    }
    
    @org.junit.Test
    public void testAreaNoEquals()
    {
        double esperado = Math.pow(objCircle.Area(),2);
        double actual = (objCircle.Area() / 2);
        assertThat(actual, is(not(esperado)));
    }
    
    @org.junit.Test
    public void testDataEquals()
    {
        String esperado = "Circulo con radio: 10.0";
        String actual = objCircle.Data();
        assertEquals(esperado, actual);
    }
    
    @org.junit.Test
    public void testDataNoEquals()
    {
        String esperado = "Circulo con radio: 10";
        String actual = objCircle.Data();
        assertThat(actual, is(not(esperado)));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCircleRadius0()
    {
        new Circle(0);
    }
    
    @org.junit.Test
    public void testGetArray() {
        double[] expectedArray = {3.5, 2, 2.5};
        double[] resultArray =  objCircle.listRadius();

        //assertArrayEquals(expectedArray, resultArray, 0.01);
        assertArrayEquals("Iguales", expectedArray, resultArray, 0.01);
    }
    
    @org.junit.Test(expected = ArithmeticException.class)  
    public void division0() {  
        int b = objCircle.divideWith0();
    }  
        
    @org.junit.Test
    public void testCanCreate() {
        boolean isTrue = objCircle.canCreate(objCircle.getRadius());
        assertTrue(isTrue);
    }    
    
    @org.junit.Test
    public void testIsNotNull() {
        double[] resultArray =  objCircle.listRadius();
        double var = resultArray[2];
        assertNotNull(var);
    }   
    
    @org.junit.Test
    public void testReturnCircle() {
        Circle objCircle2 = objCircle.returnCircle(2);
        assertEquals(objCircle.getClass(), objCircle2.getClass());
    }   
    
    @org.junit.Test
    public void testCircleRadius() {
        Circle objCircle3 = objCircle.returnCircle(10);
        double radius2 = objCircle3.getRadius();
        assertEquals(radius2, objCircle.getRadius(), 0.01);
    }
    
    @org.junit.Test
    public void testNotFound() {
        double[] resultArray =  objCircle.listRadius();
        boolean isTrue = false;
        if(resultArray[1] == 2)
            isTrue = true;
        assertTrue(isTrue);
    }
    
    
}
