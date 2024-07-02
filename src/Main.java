import peguidotte.screenmatch.modelos.Film;

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
        test2.addScore(9);
        test2.addScore(5);
        test2.addScore(9);
        test2.setProtagonist("Ryan Reynolds");
        test2.setDirector("Tim Miller");
        test2.setGenre("Action and Comedy");

        //test
        System.out.println("Film name: " + test2.getName());
        System.out.println("Score: " + test2.averageScore());
        System.out.println("+" + test2.getYearClassification());
        System.out.println("Launch: " + test2.getDate());
        System.out.println("Time: " + test2.getMinutes() + " minutes");
        System.out.println(test2.getDescription());
        if (test2.isPlanInclude()) {
            System.out.println("\nWatch now!");
        } else {
            System.out.println("\nUpgrade your plan for watch this!");
        }

    }
}