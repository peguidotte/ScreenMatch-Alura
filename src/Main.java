import peguidotte.screenmatch.models.Film;
import peguidotte.screenmatch.models.Series;
import peguidotte.screenmatch.calc.TimeCalculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film test2 = new Film();
        test2.setName("Deadpool");
        test2.setDescription("A anti-hero and comedian, dress with a red uniform, two swords, two guns and a lot of bullshits. Oh, he is immortal to.");
        test2.setDate(2016);
        test2.setMinutes(108);
        test2.setYearClassification(18);
        test2.setPlanInclude(true);
        test2.setPreview(false);
        test2.addScore(9);
        test2.addScore(5);
        test2.addScore(9);
        test2.setProtagonist("Ryan Reynolds");
        test2.setDirector("Tim Miller");
        test2.setGenre("Action and Comedy");

        //test
        System.out.println("Film name: " + test2.getName());
        if (test2.isPlanInclude() && !test2.isPreview()) {
            System.out.println("\nWatch now!");
        } else {
            System.out.println("\nUpgrade your plan or wait preview finish for watch this!");
        }

        Series test3 = new Series();
        test3.setName("The Flash");
        test3.setEpisodes(80);
        test3.setEpisodesMinutes(50);
        test3.setSeasons(10);
        test3.setActive(false);

        System.out.println(test3.getMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includeTimeCalculator(test2);
        calculator.includeTimeCalculator(test3);

        System.out.println(calculator.getCalculatedTime());


    }
}