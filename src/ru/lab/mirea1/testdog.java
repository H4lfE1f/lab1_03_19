package ru.lab.mirea1;
import java.lang.*;
public class testdog {
    public static void main(String[]args){
        dog d1 = new dog("Mike", 2);
        dog d2 = new dog ("Bobik", 7);
        dog d3 = new dog ("Shariq");
                d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
