package de.selectcode.kinderserienquiz.UI.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

/**
 * Created by steph on 06.06.2017.
 */

public class mainMenu_TEST extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout l = new LinearLayout(this.getBaseContext());

        SeriesRectangleView s = new SeriesRectangleView(this, new Serie("Film", true, "www.youtube.com"));
        l.addView(s);
    }




}
