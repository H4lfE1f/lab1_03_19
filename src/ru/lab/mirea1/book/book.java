package ru.lab.mirea1.book;
import java.lang.*;
public class book
{
    private String genre;
    private int page;

public book(String g, int p){
    genre = g;
    page = p;
}
public book(String g){
    genre = g;
    page = 0;
}
public book(){
    genre ="Story";
    page = 1;
}
    public void setPage(int page){
        this.page=page;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(String genre){
        return genre;
    }
    public int getPage(){
        return page;
    }
    public String toString(){
        return this.genre+", page "+this.page;
    }
    public void intoGenre(){
        System.out.println(genre+"'s genre is "+genre+" ");

}
}
