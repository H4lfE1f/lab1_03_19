package ru.lab.mirea1;
import java.lang.*;
public class testball {
    public static void main(String[]args){
        ball d1 = new ball("pink", 4);
        ball d2 = new ball ("white", 10);
        ball d3 = new ball ("ball");
        d3.setRad(1);
        System.out.println(d1);
        d1.intoDiameter();
        d2.intoDiameter();
        d3.intoDiameter();
    }
}