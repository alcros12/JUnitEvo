/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.sun.javafx.scene.layout.region.Margins;
import org.junit.runner.RunWith;


/**
 *
 * @author Luis
 */
public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius (double radius){
    this.radius = radius;
}
    
    public Circle()
    {
        
    }
    
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radio debe ser mayor o diferente a 0");
        }
        this.radius = radius;
    }

    public double Area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public String Data() {
        return "Circulo con radio: 10.0";
    }

    public double[] listRadius() {
        double [] lst = {3.5, 2, 2.5};
        return lst;
    }

    public boolean canCreate(double r) {
        if (r <= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public int divideWith0()
    {
        int result = (int)(radius) / 0;
        return result;
    }
    
    public Circle returnCircle(double r)
    {
        Circle objCircle = null;
        double [] lst = {3.5, 2, 2.5, 10};
        for(int i = 0; i < lst.length; i++)
        {
            if(r == lst[i])
            {
                objCircle = new Circle(r);
                return objCircle;
            }
        }
        return null;
    }
}
