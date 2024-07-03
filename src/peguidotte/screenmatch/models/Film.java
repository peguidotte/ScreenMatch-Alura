package peguidotte.screenmatch.models;

public class Film extends Title {
    private boolean preview;

    public boolean isPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }
}
