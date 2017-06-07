package de.selectcode.kinderserienquiz.UI.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.selectcode.kinderserienquiz.DataManagment.Serie;
import de.selectcode.kinderserienquiz.R;
import de.selectcode.kinderserienquiz.UI.components.SeriesRectangleView;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

        TextView t = new TextView(this.getBaseContext());
        t.setText(R.string.welcome);
        layout.addView(t);

        final Button button_start = new Button(this.getBaseContext());
        button_start.setText(R.string.start);
        layout.addView(button_start);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(mainMenu.this, levelMenu.class);
                startActivity(nextScreen);
            }
        });


    }
}
