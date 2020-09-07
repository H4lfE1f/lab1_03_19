package ru.lab.mirea1;
import java.lang.*;
public class ball
{
    private String color;
    private int rad;

    public ball (String c, int r){
        color = c;
        rad = r;
    }

    public ball (String c){
        color = c;
        rad = 0;
    }
    public ball()
    {
        color = "black";
        rad = 1;
    }
    public void setRad(int rad){
        this.rad=rad;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRad(){
        return rad;
    }
    public String toString(){
        return this.color+", rad "+this.rad;
    }
    public void intoDiameter(){
        System.out.println(color+"'s diameter is "+rad*2+" cm");
    }

}
