import peguidotte.screenmatch.calc.Filter;

import peguidotte.screenmatch.models.Film;
import peguidotte.screenmatch.models.Serie;
import peguidotte.screenmatch.calc.TimeCalculator;
import peguidotte.screenmatch.models.Title;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film deadpool = getDeadpool();

        //test
        System.out.println("Film name: " + deadpool.getName());
        if (deadpool.isPlanInclude() && !deadpool.isPreview()) {
            System.out.println("\nWatch now!");
        } else {
            System.out.println("\nUpgrade your plan or wait preview finish for watch this!");
        }

        Serie the_flash = new Serie();
        the_flash.setName("The Flash");
        the_flash.setDate(2015);
        the_flash.setEpisodes(80);
        the_flash.setEpisodesMinutes(50);
        the_flash.setSeasons(10);
        the_flash.setActive(false);


        System.out.println(the_flash.getMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includeTimeCalculator(deadpool);
        calculator.includeTimeCalculator(the_flash);

        System.out.println(calculator.getCalculatedTime());
        System.out.println(the_flash.getRating() + " stars");
        System.out.println(deadpool.getRating() + " stars");
        Filter filter = new Filter();
        filter.filter(the_flash,the_flash);
        filter.filter(deadpool,deadpool);

        var avengers = new Film();
        avengers.setName("Avengers");
        avengers.setDate(2012);

        ArrayList<Film> films = new ArrayList<>();
        films.add(avengers);
        films.add(deadpool);

        ArrayList<Serie> series = new ArrayList<>();
        series.add(the_flash);

        ArrayList<Title> titles = new ArrayList<>();
        titles.addAll(films);
        titles.addAll(series);

        System.out.println("Primeiro Filme: " + films.getFirst().getName());
        System.out.println("Segundo Filme: " + films.get(1).getName());
        System.out.println("Terceiro Título: " + titles.get(2).getName());
        System.out.println(titles);
        System.out.println(films);
    }

    private static Film getDeadpool() {
        Film deadpool = new Film();
        deadpool.setName("Deadpool");
        deadpool.setDescription("A anti-hero and comedian, dress with a red uniform, two swords, two guns and a lot of bullshits. Oh, he is immortal to.");
        deadpool.setDate(2016);
        deadpool.setMinutes(108);
        deadpool.setYearClassification(18);
        deadpool.setPlanInclude(true);
        deadpool.setPreview(false);
        deadpool.addScore(9);
        deadpool.addScore(9);
        deadpool.addScore(9);
        deadpool.setProtagonist("Ryan Reynolds");
        deadpool.setDirector("Tim Miller");
        deadpool.setGenre("Action and Comedy");
        return deadpool;
    }
}