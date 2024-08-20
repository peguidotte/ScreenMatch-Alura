package peguidotte.screenmatch.main;

import peguidotte.screenmatch.models.Film;
import peguidotte.screenmatch.models.Serie;
import peguidotte.screenmatch.models.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        var deadpool = new Film("Deadpool", 2016);
        deadpool.addScore(9.5);
        var avengers = new Film("Avengers", 2012);
        avengers.addScore(9);
        var the_flash = new Serie("The Flash", 2015, 10);

        ArrayList<Title> titles = new ArrayList<>();
        titles.add(deadpool);
        titles.add(avengers);
        titles.add(the_flash);
        for(Title title: titles) {
            if (title instanceof Film film){
                System.out.println(title + " | Star rate: " + film.getRating());
            } else {
            System.out.println(title);
            }
        }
    }
}
