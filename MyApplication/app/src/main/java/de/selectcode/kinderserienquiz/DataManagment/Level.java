package de.selectcode.kinderserienquiz.DataManagment;

import java.util.List;

/**
 * Created by steph on 06.06.2017.
 */

public class Level {
    private String name;
    private List<Serie> series;
    private int starLimit;

    public Level(String name, List<Serie> series, int starLimit) {
        this.setName(name);
        this.setSeries(series);
        this.setStarLimit(starLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public int getStarLimit() {
        return starLimit;
    }

    public void setStarLimit(int starLimit) {
        this.starLimit = starLimit;
    }

    public int getSolvedSeriesAmount(){
        int counter = 0;
        for (Serie s : series) {
            if (s.isSolved()){
                counter ++;
            }
        }
        return counter;
    }
}
