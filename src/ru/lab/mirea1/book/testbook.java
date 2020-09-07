package ru.lab.mirea1.book;
import java.lang.*;
public class testbook {
    public static void main(String[]args){
        book d1 = new book ("comedy",150);
        book d2 = new book ("horror", 10);
        book d3 = new book ("story",1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoGenre();
        d2.intoGenre();
        d3.intoGenre();

    }
}