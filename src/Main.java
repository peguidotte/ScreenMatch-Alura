//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film test1 = new Film();
        test1.name = "Deadpool";
        test1.description = "A anti-hero and comedian, dress with a red uniform, two swords, two guns and a lot of bullshits. Oh, he is immortal to.";
        test1.date = 2016;
        test1.minutes = 108;
        test1.yearClassification = 18;
        test1.planInclude = true;
        test1.totalScore = 987.8;
        test1.scoreAmount = 100;
        test1.protagonist = "Ryan Reynolds";
        test1.director = "Tim Miller";
        test1.genre = "Action and Comedy";

        test1.showMainInformations();

    }
}