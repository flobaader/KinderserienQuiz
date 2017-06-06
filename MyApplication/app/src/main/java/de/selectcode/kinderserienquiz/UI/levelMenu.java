package de.selectcode.kinderserienquiz.UI;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;

import java.util.List;

import de.selectcode.kinderserienquiz.DataManagment.Level;
import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.R;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

import static android.app.PendingIntent.getActivity;

public class levelMenu extends Activity {

    private List<Level> levelList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_menu);

        SeriesRectangleView s = new SeriesRectangleView(this, new Serie("Film", true, "www.youtube.com"));
        ConstraintLayout l = (ConstraintLayout) findViewById(R.id.layout);
        l.addView(s);
    }




}
