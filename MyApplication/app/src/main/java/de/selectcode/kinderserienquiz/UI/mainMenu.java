package de.selectcode.kinderserienquiz.UI;

import android.app.Activity;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ServiceCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;

import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.R;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

import static android.app.PendingIntent.getActivity;

public class mainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        SeriesRectangleView s = new SeriesRectangleView(this, new Serie("Film", true, "www.youtube.com"));
        ConstraintLayout l = (ConstraintLayout) findViewById(R.id.layout);
        l.addView(s);
    }




}
