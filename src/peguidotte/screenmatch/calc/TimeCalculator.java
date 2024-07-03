package peguidotte.screenmatch.calc;

import peguidotte.screenmatch.models.Title;

public class TimeCalculator {
    private int calculatedTime;

    public void includeTimeCalculator(Title x) {
        this.calculatedTime += x.getMinutes();
    }

    public int getCalculatedTime() {
        return calculatedTime;
    }
}
