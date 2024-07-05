package peguidotte.screenmatch.models;

import peguidotte.screenmatch.calc.Rate;

public class Film extends Title implements Rate {
    private boolean preview;

    public boolean isPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

    @Override
    public double getRating() {
        return (double) averageScore() / 2;
    }
}
