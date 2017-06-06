package de.selectcode.kinderserienquiz.DataBackend;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import de.selectcode.kinderserienquiz.DataManagment.Level;
import de.selectcode.kinderserienquiz.DataManagment.Serie;

/**
 * Created by floba on 06.06.2017.
 */

public class DataProvider {
    public static List<Level> getLevelData(){
        Serie s1 = new Serie("Benjamin", false, "");
        Serie s2 = new Serie("Peter", true, "");
        Serie s3 = new Serie("Bertolt", true, "");

        List<Serie> seriesList = new ArrayList<Serie>();
        seriesList.add(s1);
        seriesList.add(s2);
        seriesList.add(s3);

        Level l = new Level("Level 1",seriesList, 0);

        List<Level> levelList = new ArrayList<Level>();
        levelList.add(l);

        return levelList;
    }
}
