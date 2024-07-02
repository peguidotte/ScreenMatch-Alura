public class Film {

    //main
    String name;
    int date;
    String description;
    int minutes;
    boolean planInclude;
    int yearClassification;

    //score
    double totalScore;
    int scoreAmount;

    //plus
    String director;
    String genre;
    String protagonist;

    void showMainInformations(){
        System.out.println("Film name: " + name);
        System.out.println("Score: " + averageScore());
        System.out.println("+" + yearClassification);
        System.out.println("Launch: " + date);
        System.out.println("Time: " + minutes + " minutes");
        System.out.println(description);
        if (planInclude) {
            System.out.println("\nWatch now!");
        } else {
            System.out.println("\nUpgrade your plan for watch this!");
        }
    }

    void addScore(double score){
        totalScore += score;
        scoreAmount ++;
    }

    double averageScore(){
        return totalScore / scoreAmount;
    }

    void showPlusInformations(){
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Protagonist: " + protagonist);
    }

}
