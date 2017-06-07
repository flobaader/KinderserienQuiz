package de.selectcode.kinderserienquiz.UI.components;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import de.selectcode.kinderserienquiz.R;

/**
 * Created by floba on 07.06.2017.
 */

public abstract class IGameView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_igame_view);

        //Layout for Game Window
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                IRectangleView.LayoutParams.MATCH_PARENT,
                IRectangleView.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(LinearLayout.VERTICAL);



        //Status Bar on Top

    }



}
