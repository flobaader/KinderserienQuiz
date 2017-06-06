package de.selectcode.kinderserienquiz.UI.activities;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import de.selectcode.kinderserienquiz.DataBackend.DataProvider;
import de.selectcode.kinderserienquiz.DataManagment.Level;
import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.R;
import de.selectcode.kinderserienquiz.UI.components.LevelRectangleView;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

import static android.app.PendingIntent.getActivity;

public class levelMenu extends Activity {

    private List<Level> levelList;
    private List<LevelRectangleView> levelRectangleViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_menu);

        /*
        SeriesRectangleView s = new SeriesRectangleView(this, new Serie("Film", true, "www.youtube.com"));

        */

        levelList = DataProvider.getLevelData();
        addLevel();
    }


    private void addLevel(){
        for (Level l : levelList){
            LevelRectangleView view = new LevelRectangleView(this.getApplicationContext(), l);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    levelClicked(((LevelRectangleView)v).getLevel());
                }
            });

            LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
            layout.addView(view);
        }

    }

    private void levelClicked(Level l){
        //TODO: Implement
    }




}
