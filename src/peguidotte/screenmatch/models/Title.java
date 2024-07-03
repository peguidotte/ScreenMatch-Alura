package peguidotte.screenmatch.models;

public class Title {
    //main
    private String name;
    private int date;
    private String description;
    private int minutes;
    private boolean planInclude;
    private int yearClassification;

    //score
    private double totalScore;
    private int scoreAmount;

    //plus
    private String director;
    private String genre;
    private String protagonist;


    public int getScoreAmount() {
        return scoreAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean isPlanInclude() {
        return planInclude;
    }

    public void setPlanInclude(boolean planInclude) {
        this.planInclude = planInclude;
    }

    public int getYearClassification() {
        return yearClassification;
    }

    public void setYearClassification(int yearClassification) {
        this.yearClassification = yearClassification;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public void addScore(double score){
        totalScore += score;
        scoreAmount ++;
    }

    public double averageScore(){
        return totalScore / scoreAmount;
    }



}
