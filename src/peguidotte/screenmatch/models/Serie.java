package peguidotte.screenmatch.models;
import peguidotte.screenmatch.calc.Rate;

public class Serie extends Title implements Rate {
    private int seasons;
    private int episodes;
    private int episodesMinutes;
    private boolean active;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodesMinutes() {
        return episodesMinutes;
    }

    public void setEpisodesMinutes(int episodesMinutes) {
        this.episodesMinutes = episodesMinutes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getMinutes() {
        return episodes * episodesMinutes;
    }


    @Override
    public double getRating() {
        return (double) averageScore() / 2;
    }
}
